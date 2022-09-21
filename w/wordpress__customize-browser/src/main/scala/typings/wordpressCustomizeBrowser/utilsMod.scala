package typings.wordpressCustomizeBrowser

import typings.jquery.JQuery
import typings.jquery.JQuery.Event
import typings.std.HTMLElement
import typings.std.Record
import typings.wordpressCustomizeBrowser.classMod.Class
import typings.wordpressCustomizeBrowser.controlMod.Control
import typings.wordpressCustomizeBrowser.panelMod.Panel
import typings.wordpressCustomizeBrowser.sectionMod.Section
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  trait HighlightButtonOptions extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var focusTarget: js.UndefOr[JQuery[HTMLElement]] = js.undefined
  }
  object HighlightButtonOptions {
    
    inline def apply(): HighlightButtonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighlightButtonOptions]
    }
    
    extension [Self <: HighlightButtonOptions](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setFocusTarget(value: JQuery[HTMLElement]): Self = StObject.set(x, "focusTarget", value.asInstanceOf[js.Any])
      
      inline def setFocusTargetUndefined: Self = StObject.set(x, "focusTarget", js.undefined)
    }
  }
  
  @js.native
  trait Utils extends StObject {
    
    def areElementListsEqual(listA: js.Array[JQuery[HTMLElement]], listB: js.Array[JQuery[HTMLElement]]): Boolean = js.native
    
    def bubbleChildValueChanges(instance: Class, properties: js.Array[Any]): Unit = js.native
    
    def getCurrentTimestamp(): Double = js.native
    
    def getRemainingTime(datetime: String): Double = js.native
    def getRemainingTime(datetime: js.Date): Double = js.native
    def getRemainingTime(datetime: Double): Double = js.native
    
    def highlightButton(button: JQuery[HTMLElement]): js.Function0[Unit] = js.native
    def highlightButton(button: JQuery[HTMLElement], options: HighlightButtonOptions): js.Function0[Unit] = js.native
    
    def isKeydownButNotEnterEvent(event: Event): Boolean = js.native
    
    def parseQueryString(queryString: String): Record[String, String] = js.native
    
    def prioritySort(a: Control, b: Control): Double = js.native
    def prioritySort(a: Control, b: Panel): Double = js.native
    def prioritySort(a: Control, b: Section): Double = js.native
    def prioritySort(a: Panel, b: Control): Double = js.native
    // TODO
    def prioritySort(a: Panel, b: Panel): Double = js.native
    def prioritySort(a: Panel, b: Section): Double = js.native
    def prioritySort(a: Section, b: Control): Double = js.native
    def prioritySort(a: Section, b: Panel): Double = js.native
    def prioritySort(a: Section, b: Section): Double = js.native
  }
}
