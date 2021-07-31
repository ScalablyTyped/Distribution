package typings.unidriverProtractor

import typings.protractor.mod.ElementFinder
import typings.unidriverCore.mod.UniDriver
import typings.unidriverCore.mod.UniDriverList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@unidriver/protractor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def protractorUniDriver(el: ElementGetter): UniDriver[ElementFinder] = ^.asInstanceOf[js.Dynamic].applyDynamic("protractorUniDriver")(el.asInstanceOf[js.Any]).asInstanceOf[UniDriver[ElementFinder]]
  
  @scala.inline
  def protractorUniDriverList(elems: ElementsGetter): UniDriverList[ElementFinder] = ^.asInstanceOf[js.Dynamic].applyDynamic("protractorUniDriverList")(elems.asInstanceOf[js.Any]).asInstanceOf[UniDriverList[ElementFinder]]
  
  type ElementGetter = js.Function0[js.Promise[ElementFinder | Null]]
  
  type ElementsGetter = js.Function0[js.Promise[js.Array[ElementFinder]]]
}
