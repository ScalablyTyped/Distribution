package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "MainData")
@js.native
class MainData ()
  extends typings.wonderJs.mainDataMod.MainData
/* static members */
object MainData {
  
  @JSImport("wonder.js/dist/es2015", "MainData")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wonder.js/dist/es2015", "MainData.isTest")
  @js.native
  def isTest: Boolean = js.native
  @scala.inline
  def isTest_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isTest")(x.asInstanceOf[js.Any])
  
  @JSImport("wonder.js/dist/es2015", "MainData.screenSize")
  @js.native
  def screenSize: typings.wonderJs.escreensizeMod.EScreenSize & typings.wonderJs.rectRegionMod.RectRegion = js.native
  @scala.inline
  def screenSize_=(x: typings.wonderJs.escreensizeMod.EScreenSize & typings.wonderJs.rectRegionMod.RectRegion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("screenSize")(x.asInstanceOf[js.Any])
}
