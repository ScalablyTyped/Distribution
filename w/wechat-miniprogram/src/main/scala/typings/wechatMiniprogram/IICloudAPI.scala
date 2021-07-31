package typings.wechatMiniprogram

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IICloudAPI
  extends StObject
     with /* api */ StringDictionary[AnyFunction | (IAPIFunction[js.Any, js.Any])] {
  
  def init(): Unit = js.native
  def init(config: IInitCloudConfig): Unit = js.native
}
