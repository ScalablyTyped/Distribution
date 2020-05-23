package typings.wonderJs

import typings.wonderJs.anon.CanvasId
import typings.wonderJs.anon.TypeofMain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/Main", JSImport.Namespace)
@js.native
object mainMod extends js.Object {
  @js.native
  class Main () extends js.Object
  
  /* static members */
  @js.native
  object Main extends js.Object {
    def init(): TypeofMain = js.native
    def setConfig(hasCanvasIdIsTestScreenSizeUseDevicePixelRatioContextConfig: CanvasId): TypeofMain = js.native
  }
  
}

