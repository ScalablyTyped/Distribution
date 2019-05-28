package typings
package styledDashComponentsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassImage
  extends org.scalablytyped.runtime.Instantiable0[reactDashNativeLib.reactDashNativeMod.Image] {
  var abortPrefetch: js.UndefOr[js.Function1[/* requestId */ scala.Double, scala.Unit]] = js.native
  var queryCache: js.UndefOr[
    js.Function1[
      /* urls */ js.Array[java.lang.String], 
      js.Promise[
        org.scalablytyped.runtime.StringDictionary[
          styledDashComponentsLib.styledDashComponentsLibStrings.memory | styledDashComponentsLib.styledDashComponentsLibStrings.disk | styledDashComponentsLib.styledDashComponentsLibStrings.`disk/memory`
        ]
      ]
    ]
  ] = js.native
  def getSize(
    uri: java.lang.String,
    success: js.Function2[/* width */ scala.Double, /* height */ scala.Double, scala.Unit],
    failure: js.Function1[/* error */ js.Any, scala.Unit]
  ): js.Any = js.native
  def prefetch(url: java.lang.String): js.Any = js.native
  /**
    * @see https://facebook.github.io/react-native/docs/image.html#resolveassetsource
    */
  def resolveAssetSource(source: reactDashNativeLib.reactDashNativeMod.ImageSourcePropType): reactDashNativeLib.reactDashNativeMod.ImageResolvedAssetSource = js.native
}

