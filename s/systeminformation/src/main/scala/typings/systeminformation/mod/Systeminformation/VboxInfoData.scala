package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 9. Virtual Box
@js.native
trait VboxInfoData extends StObject {
  
  var ACPI: Boolean = js.native
  
  var APIC: Boolean = js.native
  
  var HPET: Boolean = js.native
  
  var IOAPIC: Boolean = js.native
  
  var PAE: Boolean = js.native
  
  var RTC: String = js.native
  
  var X2APIC: Boolean = js.native
  
  var biosAPICmode: String = js.native
  
  var bootDevice1: String = js.native
  
  var bootDevice2: String = js.native
  
  var bootDevice3: String = js.native
  
  var bootDevice4: String = js.native
  
  var bootMenuMode: String = js.native
  
  var chipset: String = js.native
  
  var configFile: String = js.native
  
  var cpuExepCap: String = js.native
  
  var cpuProfile: String = js.native
  
  var cpus: Double = js.native
  
  var firmware: String = js.native
  
  var guestOS: String = js.native
  
  var hardwareUUID: String = js.native
  
  var id: String = js.native
  
  var logFolder: String = js.native
  
  var longMode: Boolean = js.native
  
  var memory: Double = js.native
  
  var name: String = js.native
  
  var pageFusion: Boolean = js.native
  
  var running: Boolean = js.native
  
  var runningSince: Double = js.native
  
  var snapshotFolder: String = js.native
  
  var started: String = js.native
  
  var stopped: String = js.native
  
  var stoppedSince: Double = js.native
  
  var timeOffset: String = js.native
  
  var tripleFaultReset: Boolean = js.native
  
  var vram: Double = js.native
}
object VboxInfoData {
  
  @scala.inline
  def apply(
    ACPI: Boolean,
    APIC: Boolean,
    HPET: Boolean,
    IOAPIC: Boolean,
    PAE: Boolean,
    RTC: String,
    X2APIC: Boolean,
    biosAPICmode: String,
    bootDevice1: String,
    bootDevice2: String,
    bootDevice3: String,
    bootDevice4: String,
    bootMenuMode: String,
    chipset: String,
    configFile: String,
    cpuExepCap: String,
    cpuProfile: String,
    cpus: Double,
    firmware: String,
    guestOS: String,
    hardwareUUID: String,
    id: String,
    logFolder: String,
    longMode: Boolean,
    memory: Double,
    name: String,
    pageFusion: Boolean,
    running: Boolean,
    runningSince: Double,
    snapshotFolder: String,
    started: String,
    stopped: String,
    stoppedSince: Double,
    timeOffset: String,
    tripleFaultReset: Boolean,
    vram: Double
  ): VboxInfoData = {
    val __obj = js.Dynamic.literal(ACPI = ACPI.asInstanceOf[js.Any], APIC = APIC.asInstanceOf[js.Any], HPET = HPET.asInstanceOf[js.Any], IOAPIC = IOAPIC.asInstanceOf[js.Any], PAE = PAE.asInstanceOf[js.Any], RTC = RTC.asInstanceOf[js.Any], X2APIC = X2APIC.asInstanceOf[js.Any], biosAPICmode = biosAPICmode.asInstanceOf[js.Any], bootDevice1 = bootDevice1.asInstanceOf[js.Any], bootDevice2 = bootDevice2.asInstanceOf[js.Any], bootDevice3 = bootDevice3.asInstanceOf[js.Any], bootDevice4 = bootDevice4.asInstanceOf[js.Any], bootMenuMode = bootMenuMode.asInstanceOf[js.Any], chipset = chipset.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], cpuExepCap = cpuExepCap.asInstanceOf[js.Any], cpuProfile = cpuProfile.asInstanceOf[js.Any], cpus = cpus.asInstanceOf[js.Any], firmware = firmware.asInstanceOf[js.Any], guestOS = guestOS.asInstanceOf[js.Any], hardwareUUID = hardwareUUID.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], logFolder = logFolder.asInstanceOf[js.Any], longMode = longMode.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pageFusion = pageFusion.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any], runningSince = runningSince.asInstanceOf[js.Any], snapshotFolder = snapshotFolder.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], stopped = stopped.asInstanceOf[js.Any], stoppedSince = stoppedSince.asInstanceOf[js.Any], timeOffset = timeOffset.asInstanceOf[js.Any], tripleFaultReset = tripleFaultReset.asInstanceOf[js.Any], vram = vram.asInstanceOf[js.Any])
    __obj.asInstanceOf[VboxInfoData]
  }
  
  @scala.inline
  implicit class VboxInfoDataMutableBuilder[Self <: VboxInfoData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setACPI(value: Boolean): Self = StObject.set(x, "ACPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAPIC(value: Boolean): Self = StObject.set(x, "APIC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiosAPICmode(value: String): Self = StObject.set(x, "biosAPICmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootDevice1(value: String): Self = StObject.set(x, "bootDevice1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootDevice2(value: String): Self = StObject.set(x, "bootDevice2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootDevice3(value: String): Self = StObject.set(x, "bootDevice3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootDevice4(value: String): Self = StObject.set(x, "bootDevice4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootMenuMode(value: String): Self = StObject.set(x, "bootMenuMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChipset(value: String): Self = StObject.set(x, "chipset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuExepCap(value: String): Self = StObject.set(x, "cpuExepCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuProfile(value: String): Self = StObject.set(x, "cpuProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpus(value: Double): Self = StObject.set(x, "cpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirmware(value: String): Self = StObject.set(x, "firmware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuestOS(value: String): Self = StObject.set(x, "guestOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHPET(value: Boolean): Self = StObject.set(x, "HPET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardwareUUID(value: String): Self = StObject.set(x, "hardwareUUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIOAPIC(value: Boolean): Self = StObject.set(x, "IOAPIC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogFolder(value: String): Self = StObject.set(x, "logFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongMode(value: Boolean): Self = StObject.set(x, "longMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPAE(value: Boolean): Self = StObject.set(x, "PAE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageFusion(value: Boolean): Self = StObject.set(x, "pageFusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRTC(value: String): Self = StObject.set(x, "RTC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningSince(value: Double): Self = StObject.set(x, "runningSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotFolder(value: String): Self = StObject.set(x, "snapshotFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarted(value: String): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopped(value: String): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoppedSince(value: Double): Self = StObject.set(x, "stoppedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTripleFaultReset(value: Boolean): Self = StObject.set(x, "tripleFaultReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVram(value: Double): Self = StObject.set(x, "vram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2APIC(value: Boolean): Self = StObject.set(x, "X2APIC", value.asInstanceOf[js.Any])
  }
}
