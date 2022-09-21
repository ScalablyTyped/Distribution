package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessFdinfo extends StObject {
  
  var epollCounters: js.UndefOr[js.Array[ProcessFdinfoEpollCounter]] = js.undefined
  
  var eventCounter: js.UndefOr[Double] = js.undefined
  
  var fanotifyEventFlags: js.UndefOr[Double] = js.undefined
  
  var fanotifyFlags: js.UndefOr[Double] = js.undefined
  
  var fanotifyMarks: js.UndefOr[js.Array[ProcessFdinfoFanotifyMark]] = js.undefined
  
  var flags: Double
  
  var inotifyFiles: js.UndefOr[js.Array[ProcessFdinfoInotifyFile]] = js.undefined
  
  var mountId: Double
  
  var position: Double
  
  var rtSignalMask: js.UndefOr[Double] = js.undefined
  
  var signalMask: js.UndefOr[Double] = js.undefined
  
  var timerClockId: js.UndefOr[Double] = js.undefined
  
  var timerInterval: js.UndefOr[js.Array[Double]] = js.undefined
  
  var timerSettimeFlags: js.UndefOr[Double] = js.undefined
  
  var timerTicks: js.UndefOr[Double] = js.undefined
  
  var timerValue: js.UndefOr[js.Array[Double]] = js.undefined
  
  var `type`: ProcessFdinfoType
}
object ProcessFdinfo {
  
  inline def apply(flags: Double, mountId: Double, position: Double, `type`: ProcessFdinfoType): ProcessFdinfo = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], mountId = mountId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessFdinfo]
  }
  
  extension [Self <: ProcessFdinfo](x: Self) {
    
    inline def setEpollCounters(value: js.Array[ProcessFdinfoEpollCounter]): Self = StObject.set(x, "epollCounters", value.asInstanceOf[js.Any])
    
    inline def setEpollCountersUndefined: Self = StObject.set(x, "epollCounters", js.undefined)
    
    inline def setEpollCountersVarargs(value: ProcessFdinfoEpollCounter*): Self = StObject.set(x, "epollCounters", js.Array(value*))
    
    inline def setEventCounter(value: Double): Self = StObject.set(x, "eventCounter", value.asInstanceOf[js.Any])
    
    inline def setEventCounterUndefined: Self = StObject.set(x, "eventCounter", js.undefined)
    
    inline def setFanotifyEventFlags(value: Double): Self = StObject.set(x, "fanotifyEventFlags", value.asInstanceOf[js.Any])
    
    inline def setFanotifyEventFlagsUndefined: Self = StObject.set(x, "fanotifyEventFlags", js.undefined)
    
    inline def setFanotifyFlags(value: Double): Self = StObject.set(x, "fanotifyFlags", value.asInstanceOf[js.Any])
    
    inline def setFanotifyFlagsUndefined: Self = StObject.set(x, "fanotifyFlags", js.undefined)
    
    inline def setFanotifyMarks(value: js.Array[ProcessFdinfoFanotifyMark]): Self = StObject.set(x, "fanotifyMarks", value.asInstanceOf[js.Any])
    
    inline def setFanotifyMarksUndefined: Self = StObject.set(x, "fanotifyMarks", js.undefined)
    
    inline def setFanotifyMarksVarargs(value: ProcessFdinfoFanotifyMark*): Self = StObject.set(x, "fanotifyMarks", js.Array(value*))
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setInotifyFiles(value: js.Array[ProcessFdinfoInotifyFile]): Self = StObject.set(x, "inotifyFiles", value.asInstanceOf[js.Any])
    
    inline def setInotifyFilesUndefined: Self = StObject.set(x, "inotifyFiles", js.undefined)
    
    inline def setInotifyFilesVarargs(value: ProcessFdinfoInotifyFile*): Self = StObject.set(x, "inotifyFiles", js.Array(value*))
    
    inline def setMountId(value: Double): Self = StObject.set(x, "mountId", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRtSignalMask(value: Double): Self = StObject.set(x, "rtSignalMask", value.asInstanceOf[js.Any])
    
    inline def setRtSignalMaskUndefined: Self = StObject.set(x, "rtSignalMask", js.undefined)
    
    inline def setSignalMask(value: Double): Self = StObject.set(x, "signalMask", value.asInstanceOf[js.Any])
    
    inline def setSignalMaskUndefined: Self = StObject.set(x, "signalMask", js.undefined)
    
    inline def setTimerClockId(value: Double): Self = StObject.set(x, "timerClockId", value.asInstanceOf[js.Any])
    
    inline def setTimerClockIdUndefined: Self = StObject.set(x, "timerClockId", js.undefined)
    
    inline def setTimerInterval(value: js.Array[Double]): Self = StObject.set(x, "timerInterval", value.asInstanceOf[js.Any])
    
    inline def setTimerIntervalUndefined: Self = StObject.set(x, "timerInterval", js.undefined)
    
    inline def setTimerIntervalVarargs(value: Double*): Self = StObject.set(x, "timerInterval", js.Array(value*))
    
    inline def setTimerSettimeFlags(value: Double): Self = StObject.set(x, "timerSettimeFlags", value.asInstanceOf[js.Any])
    
    inline def setTimerSettimeFlagsUndefined: Self = StObject.set(x, "timerSettimeFlags", js.undefined)
    
    inline def setTimerTicks(value: Double): Self = StObject.set(x, "timerTicks", value.asInstanceOf[js.Any])
    
    inline def setTimerTicksUndefined: Self = StObject.set(x, "timerTicks", js.undefined)
    
    inline def setTimerValue(value: js.Array[Double]): Self = StObject.set(x, "timerValue", value.asInstanceOf[js.Any])
    
    inline def setTimerValueUndefined: Self = StObject.set(x, "timerValue", js.undefined)
    
    inline def setTimerValueVarargs(value: Double*): Self = StObject.set(x, "timerValue", js.Array(value*))
    
    inline def setType(value: ProcessFdinfoType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
