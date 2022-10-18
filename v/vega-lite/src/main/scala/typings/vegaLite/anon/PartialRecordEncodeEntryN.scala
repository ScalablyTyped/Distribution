package typings.vegaLite.anon

import typings.vegaTypings.typesSpecEncodeMod.TextEncodeEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<vega.vega.EncodeEntryName, vega.vega.TextEncodeEntry>> */
trait PartialRecordEncodeEntryN extends StObject {
  
  var enter: js.UndefOr[TextEncodeEntry] = js.undefined
  
  var exit: js.UndefOr[TextEncodeEntry] = js.undefined
  
  var hover: js.UndefOr[TextEncodeEntry] = js.undefined
  
  var leave: js.UndefOr[TextEncodeEntry] = js.undefined
  
  var release: js.UndefOr[TextEncodeEntry] = js.undefined
  
  var select: js.UndefOr[TextEncodeEntry] = js.undefined
  
  var update: js.UndefOr[TextEncodeEntry] = js.undefined
}
object PartialRecordEncodeEntryN {
  
  inline def apply(): PartialRecordEncodeEntryN = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordEncodeEntryN]
  }
  
  extension [Self <: PartialRecordEncodeEntryN](x: Self) {
    
    inline def setEnter(value: TextEncodeEntry): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: TextEncodeEntry): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    inline def setHover(value: TextEncodeEntry): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setLeave(value: TextEncodeEntry): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
    
    inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    
    inline def setRelease(value: TextEncodeEntry): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    inline def setSelect(value: TextEncodeEntry): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setUpdate(value: TextEncodeEntry): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
