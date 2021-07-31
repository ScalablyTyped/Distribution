package typings.unidriverJsdomReact

import typings.std.Element
import typings.unidriverCore.mod.UniDriver
import typings.unidriverCore.mod.UniDriverList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@unidriver/jsdom-react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def jsdomReactUniDriver(containerOrFn: ElementOrElementFinder): UniDriver[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsdomReactUniDriver")(containerOrFn.asInstanceOf[js.Any]).asInstanceOf[UniDriver[Element]]
  
  @scala.inline
  def jsdomReactUniDriverList(containerOrFn: ElementsOrElementsFinder): UniDriverList[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsdomReactUniDriverList")(containerOrFn.asInstanceOf[js.Any]).asInstanceOf[UniDriverList[Element]]
  
  type ElementOrElementFinder = (js.Function0[Element | js.Promise[Element]]) | Element
  
  type ElementsOrElementsFinder = (js.Function0[js.Array[Element] | js.Promise[js.Array[Element]]]) | js.Array[Element]
}
