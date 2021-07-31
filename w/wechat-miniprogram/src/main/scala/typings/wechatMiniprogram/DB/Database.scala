package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.ICloudConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The class of all exposed cloud database instances
  */
trait Database extends StObject {
  
  val Geo: IGeo
  
  def RegExp(options: IRegExpOptions): typings.wechatMiniprogram.DB.RegExp
  @JSName("RegExp")
  val RegExp_Original: IRegExpConstructor
  
  def collection(collectionName: String): CollectionReference
  
  val command: DatabaseCommand
  
  val config: ICloudConfig
  
  def serverDate(): ServerDate
}
object Database {
  
  @scala.inline
  def apply(
    Geo: IGeo,
    RegExp: IRegExpConstructor,
    collection: String => CollectionReference,
    command: DatabaseCommand,
    config: ICloudConfig,
    serverDate: () => ServerDate
  ): Database = {
    val __obj = js.Dynamic.literal(Geo = Geo.asInstanceOf[js.Any], RegExp = RegExp.asInstanceOf[js.Any], collection = js.Any.fromFunction1(collection), command = command.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], serverDate = js.Any.fromFunction0(serverDate))
    __obj.asInstanceOf[Database]
  }
  
  @scala.inline
  implicit class DatabaseMutableBuilder[Self <: Database] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollection(value: String => CollectionReference): Self = StObject.set(x, "collection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCommand(value: DatabaseCommand): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: ICloudConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeo(value: IGeo): Self = StObject.set(x, "Geo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegExp(value: IRegExpConstructor): Self = StObject.set(x, "RegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerDate(value: () => ServerDate): Self = StObject.set(x, "serverDate", js.Any.fromFunction0(value))
  }
}
