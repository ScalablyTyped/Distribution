package typings.wxServerSdk.mod

import typings.wxServerSdk.wxServerSdkStrings.asc
import typings.wxServerSdk.wxServerSdkStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends StObject {
  
  def count(): js.Promise[CountCollectionResult] = js.native
  
  def field(definition: js.Object): Collection | Query | Document = js.native
  
  def get(): js.Promise[GetCollectionResult] = js.native
  
  def limit(max: Double): Collection | Query = js.native
  
  @JSName("orderBy")
  def orderBy_asc(fieldName: String, order: asc): Collection | Query = js.native
  @JSName("orderBy")
  def orderBy_desc(fieldName: String, order: desc): Collection | Query = js.native
  
  def remove(): js.Promise[RemoveCollectionResult] = js.native
  
  def skip(offset: Double): Collection | Query = js.native
  
  def update(options: CommonOption[_]): js.Promise[UpateCollectionResult] = js.native
}
