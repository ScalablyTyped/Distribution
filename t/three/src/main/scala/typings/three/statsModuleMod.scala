package typings.three

import typings.std.HTMLCanvasElement
import typings.std.HTMLDivElement
import typings.three.statsModuleMod.Stats.Panel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statsModuleMod {
  
  object default {
    
    inline def apply(): Stats = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Stats]
    
    @JSImport("three/examples/jsm/libs/stats.module", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def Panel(): typings.three.statsModuleMod.Stats.Panel = ^.asInstanceOf[js.Dynamic].applyDynamic("Panel")().asInstanceOf[typings.three.statsModuleMod.Stats.Panel]
    inline def Panel(name: String): typings.three.statsModuleMod.Stats.Panel = ^.asInstanceOf[js.Dynamic].applyDynamic("Panel")(name.asInstanceOf[js.Any]).asInstanceOf[typings.three.statsModuleMod.Stats.Panel]
    inline def Panel(name: String, fg: String): typings.three.statsModuleMod.Stats.Panel = (^.asInstanceOf[js.Dynamic].applyDynamic("Panel")(name.asInstanceOf[js.Any], fg.asInstanceOf[js.Any])).asInstanceOf[typings.three.statsModuleMod.Stats.Panel]
    inline def Panel(name: String, fg: String, bg: String): typings.three.statsModuleMod.Stats.Panel = (^.asInstanceOf[js.Dynamic].applyDynamic("Panel")(name.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], bg.asInstanceOf[js.Any])).asInstanceOf[typings.three.statsModuleMod.Stats.Panel]
    inline def Panel(name: String, fg: Unit, bg: String): typings.three.statsModuleMod.Stats.Panel = (^.asInstanceOf[js.Dynamic].applyDynamic("Panel")(name.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], bg.asInstanceOf[js.Any])).asInstanceOf[typings.three.statsModuleMod.Stats.Panel]
    inline def Panel(name: Unit, fg: String): typings.three.statsModuleMod.Stats.Panel = (^.asInstanceOf[js.Dynamic].applyDynamic("Panel")(name.asInstanceOf[js.Any], fg.asInstanceOf[js.Any])).asInstanceOf[typings.three.statsModuleMod.Stats.Panel]
    inline def Panel(name: Unit, fg: String, bg: String): typings.three.statsModuleMod.Stats.Panel = (^.asInstanceOf[js.Dynamic].applyDynamic("Panel")(name.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], bg.asInstanceOf[js.Any])).asInstanceOf[typings.three.statsModuleMod.Stats.Panel]
    inline def Panel(name: Unit, fg: Unit, bg: String): typings.three.statsModuleMod.Stats.Panel = (^.asInstanceOf[js.Dynamic].applyDynamic("Panel")(name.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], bg.asInstanceOf[js.Any])).asInstanceOf[typings.three.statsModuleMod.Stats.Panel]
  }
  
  trait Stats extends StObject {
    
    var REVISION: Double
    
    def addPanel(panel: Panel): Panel
    
    def begin(): Unit
    
    var dom: HTMLDivElement
    
    var domElement: HTMLDivElement
    
    def end(): Double
    
    def setMode(id: Double): Unit
    
    def showPanel(id: Double): Unit
    
    def update(): Unit
  }
  object Stats {
    
    inline def apply(
      REVISION: Double,
      addPanel: Panel => Panel,
      begin: () => Unit,
      dom: HTMLDivElement,
      domElement: HTMLDivElement,
      end: () => Double,
      setMode: Double => Unit,
      showPanel: Double => Unit,
      update: () => Unit
    ): Stats = {
      val __obj = js.Dynamic.literal(REVISION = REVISION.asInstanceOf[js.Any], addPanel = js.Any.fromFunction1(addPanel), begin = js.Any.fromFunction0(begin), dom = dom.asInstanceOf[js.Any], domElement = domElement.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), setMode = js.Any.fromFunction1(setMode), showPanel = js.Any.fromFunction1(showPanel), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[Stats]
    }
    
    trait Panel extends StObject {
      
      var dom: HTMLCanvasElement
      
      def update(value: Double, maxValue: Double): Unit
    }
    object Panel {
      
      inline def apply(dom: HTMLCanvasElement, update: (Double, Double) => Unit): Panel = {
        val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], update = js.Any.fromFunction2(update))
        __obj.asInstanceOf[Panel]
      }
      
      extension [Self <: Panel](x: Self) {
        
        inline def setDom(value: HTMLCanvasElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
        
        inline def setUpdate(value: (Double, Double) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
      }
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setAddPanel(value: Panel => Panel): Self = StObject.set(x, "addPanel", js.Any.fromFunction1(value))
      
      inline def setBegin(value: () => Unit): Self = StObject.set(x, "begin", js.Any.fromFunction0(value))
      
      inline def setDom(value: HTMLDivElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      inline def setDomElement(value: HTMLDivElement): Self = StObject.set(x, "domElement", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: () => Double): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setREVISION(value: Double): Self = StObject.set(x, "REVISION", value.asInstanceOf[js.Any])
      
      inline def setSetMode(value: Double => Unit): Self = StObject.set(x, "setMode", js.Any.fromFunction1(value))
      
      inline def setShowPanel(value: Double => Unit): Self = StObject.set(x, "showPanel", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
}
