package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 9. Virtual Box
trait VboxInfoData extends StObject {
  
  var acpi: Boolean
  
  var apic: Boolean
  
  var biosApicMode: String
  
  var bootDevice1: String
  
  var bootDevice2: String
  
  var bootDevice3: String
  
  var bootDevice4: String
  
  var bootMenuMode: String
  
  var chipset: String
  
  var configFile: String
  
  var cpuExepCap: String
  
  var cpuProfile: String
  
  var cpus: Double
  
  var firmware: String
  
  var guestOS: String
  
  var hardwareUUID: String
  
  var hpet: Boolean
  
  var id: String
  
  var ioApic: Boolean
  
  var logFolder: String
  
  var longMode: Boolean
  
  var memory: Double
  
  var name: String
  
  var pae: Boolean
  
  var pageFusion: Boolean
  
  var rtc: String
  
  var running: Boolean
  
  var runningSince: Double
  
  var snapshotFolder: String
  
  var started: String
  
  var stopped: String
  
  var stoppedSince: Double
  
  var timeOffset: String
  
  var tripleFaultReset: Boolean
  
  var vram: Double
  
  var x2Apic: Boolean
}
object VboxInfoData {
  
  inline def apply(
    acpi: Boolean,
    apic: Boolean,
    biosApicMode: String,
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
    hpet: Boolean,
    id: String,
    ioApic: Boolean,
    logFolder: String,
    longMode: Boolean,
    memory: Double,
    name: String,
    pae: Boolean,
    pageFusion: Boolean,
    rtc: String,
    running: Boolean,
    runningSince: Double,
    snapshotFolder: String,
    started: String,
    stopped: String,
    stoppedSince: Double,
    timeOffset: String,
    tripleFaultReset: Boolean,
    vram: Double,
    x2Apic: Boolean
  ): VboxInfoData = {
    val __obj = js.Dynamic.literal(acpi = acpi.asInstanceOf[js.Any], apic = apic.asInstanceOf[js.Any], biosApicMode = biosApicMode.asInstanceOf[js.Any], bootDevice1 = bootDevice1.asInstanceOf[js.Any], bootDevice2 = bootDevice2.asInstanceOf[js.Any], bootDevice3 = bootDevice3.asInstanceOf[js.Any], bootDevice4 = bootDevice4.asInstanceOf[js.Any], bootMenuMode = bootMenuMode.asInstanceOf[js.Any], chipset = chipset.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], cpuExepCap = cpuExepCap.asInstanceOf[js.Any], cpuProfile = cpuProfile.asInstanceOf[js.Any], cpus = cpus.asInstanceOf[js.Any], firmware = firmware.asInstanceOf[js.Any], guestOS = guestOS.asInstanceOf[js.Any], hardwareUUID = hardwareUUID.asInstanceOf[js.Any], hpet = hpet.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ioApic = ioApic.asInstanceOf[js.Any], logFolder = logFolder.asInstanceOf[js.Any], longMode = longMode.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pae = pae.asInstanceOf[js.Any], pageFusion = pageFusion.asInstanceOf[js.Any], rtc = rtc.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any], runningSince = runningSince.asInstanceOf[js.Any], snapshotFolder = snapshotFolder.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], stopped = stopped.asInstanceOf[js.Any], stoppedSince = stoppedSince.asInstanceOf[js.Any], timeOffset = timeOffset.asInstanceOf[js.Any], tripleFaultReset = tripleFaultReset.asInstanceOf[js.Any], vram = vram.asInstanceOf[js.Any], x2Apic = x2Apic.asInstanceOf[js.Any])
    __obj.asInstanceOf[VboxInfoData]
  }
  
  extension [Self <: VboxInfoData](x: Self) {
    
    inline def setAcpi(value: Boolean): Self = StObject.set(x, "acpi", value.asInstanceOf[js.Any])
    
    inline def setApic(value: Boolean): Self = StObject.set(x, "apic", value.asInstanceOf[js.Any])
    
    inline def setBiosApicMode(value: String): Self = StObject.set(x, "biosApicMode", value.asInstanceOf[js.Any])
    
    inline def setBootDevice1(value: String): Self = StObject.set(x, "bootDevice1", value.asInstanceOf[js.Any])
    
    inline def setBootDevice2(value: String): Self = StObject.set(x, "bootDevice2", value.asInstanceOf[js.Any])
    
    inline def setBootDevice3(value: String): Self = StObject.set(x, "bootDevice3", value.asInstanceOf[js.Any])
    
    inline def setBootDevice4(value: String): Self = StObject.set(x, "bootDevice4", value.asInstanceOf[js.Any])
    
    inline def setBootMenuMode(value: String): Self = StObject.set(x, "bootMenuMode", value.asInstanceOf[js.Any])
    
    inline def setChipset(value: String): Self = StObject.set(x, "chipset", value.asInstanceOf[js.Any])
    
    inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
    
    inline def setCpuExepCap(value: String): Self = StObject.set(x, "cpuExepCap", value.asInstanceOf[js.Any])
    
    inline def setCpuProfile(value: String): Self = StObject.set(x, "cpuProfile", value.asInstanceOf[js.Any])
    
    inline def setCpus(value: Double): Self = StObject.set(x, "cpus", value.asInstanceOf[js.Any])
    
    inline def setFirmware(value: String): Self = StObject.set(x, "firmware", value.asInstanceOf[js.Any])
    
    inline def setGuestOS(value: String): Self = StObject.set(x, "guestOS", value.asInstanceOf[js.Any])
    
    inline def setHardwareUUID(value: String): Self = StObject.set(x, "hardwareUUID", value.asInstanceOf[js.Any])
    
    inline def setHpet(value: Boolean): Self = StObject.set(x, "hpet", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIoApic(value: Boolean): Self = StObject.set(x, "ioApic", value.asInstanceOf[js.Any])
    
    inline def setLogFolder(value: String): Self = StObject.set(x, "logFolder", value.asInstanceOf[js.Any])
    
    inline def setLongMode(value: Boolean): Self = StObject.set(x, "longMode", value.asInstanceOf[js.Any])
    
    inline def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPae(value: Boolean): Self = StObject.set(x, "pae", value.asInstanceOf[js.Any])
    
    inline def setPageFusion(value: Boolean): Self = StObject.set(x, "pageFusion", value.asInstanceOf[js.Any])
    
    inline def setRtc(value: String): Self = StObject.set(x, "rtc", value.asInstanceOf[js.Any])
    
    inline def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
    
    inline def setRunningSince(value: Double): Self = StObject.set(x, "runningSince", value.asInstanceOf[js.Any])
    
    inline def setSnapshotFolder(value: String): Self = StObject.set(x, "snapshotFolder", value.asInstanceOf[js.Any])
    
    inline def setStarted(value: String): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    inline def setStopped(value: String): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
    
    inline def setStoppedSince(value: Double): Self = StObject.set(x, "stoppedSince", value.asInstanceOf[js.Any])
    
    inline def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    inline def setTripleFaultReset(value: Boolean): Self = StObject.set(x, "tripleFaultReset", value.asInstanceOf[js.Any])
    
    inline def setVram(value: Double): Self = StObject.set(x, "vram", value.asInstanceOf[js.Any])
    
    inline def setX2Apic(value: Boolean): Self = StObject.set(x, "x2Apic", value.asInstanceOf[js.Any])
  }
}
