package typings.styledComponents.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.ImageResolvedAssetSource
import typings.reactNative.mod.ImageSourcePropType
import typings.styledComponents.styledComponentsStrings.disk
import typings.styledComponents.styledComponentsStrings.diskSlashmemory
import typings.styledComponents.styledComponentsStrings.memory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofImageInstantiable
  extends StObject
     with Instantiable1[/* props */ ReadonlyImageProps, typings.reactPrimitives.mod.Image] {
  
  var abortPrefetch: js.UndefOr[js.Function1[/* requestId */ Double, Unit]] = js.native
  
  def getSize(uri: String, success: js.Function2[/* width */ Double, /* height */ Double, Unit]): Any = js.native
  def getSize(
    uri: String,
    success: js.Function2[/* width */ Double, /* height */ Double, Unit],
    failure: js.Function1[/* error */ Any, Unit]
  ): Any = js.native
  
  def getSizeWithHeaders(
    uri: String,
    headers: StringDictionary[String],
    success: js.Function2[/* width */ Double, /* height */ Double, Unit]
  ): Any = js.native
  def getSizeWithHeaders(
    uri: String,
    headers: StringDictionary[String],
    success: js.Function2[/* width */ Double, /* height */ Double, Unit],
    failure: js.Function1[/* error */ Any, Unit]
  ): Any = js.native
  
  def prefetch(url: String): js.Promise[Boolean] = js.native
  
  def prefetchWithMetadata(url: String, queryRootName: String): js.Promise[Boolean] = js.native
  def prefetchWithMetadata(url: String, queryRootName: String, rootTag: Double): js.Promise[Boolean] = js.native
  
  var queryCache: js.UndefOr[
    js.Function1[
      /* urls */ js.Array[String], 
      js.Promise[StringDictionary[memory | disk | diskSlashmemory]]
    ]
  ] = js.native
  
  /**
    * @see https://reactnative.dev/docs/image#resolveassetsource
    */
  def resolveAssetSource(source: ImageSourcePropType): ImageResolvedAssetSource = js.native
}
