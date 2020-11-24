package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The class of all exposed cloud database instances
  */
@js.native
trait Database extends js.Object {
  
  val Geo: IGeo = js.native
  
  def RegExp(options: IRegExpOptions): typings.wechatMiniprogram.DB.RegExp = js.native
  @JSName("RegExp")
  val RegExp_Original: IRegExpConstructor = js.native
  
  def collection(collectionName: String): CollectionReference = js.native
  
  val command: DatabaseCommand = js.native
  
  val config: ICloudConfig = js.native
  
  def serverDate(): ServerDate = js.native
}
