package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 9. Virtual Box
trait VboxInfoData extends js.Object {
  var ACPI: Boolean
  var APIC: Boolean
  var HPET: Boolean
  var IOAPIC: Boolean
  var PAE: Boolean
  var RTC: String
  var X2APIC: Boolean
  var biosAPICmode: String
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
  var id: String
  var logFolder: String
  var longMode: Boolean
  var memory: Double
  var name: String
  var pageFusion: Boolean
  var running: Boolean
  var runningSince: Double
  var snapshotFolder: String
  var started: String
  var stopped: String
  var stoppedSince: Double
  var timeOffset: String
  var tripleFaultReset: Boolean
  var vram: Double
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
    val __obj = js.Dynamic.literal(ACPI = ACPI, APIC = APIC, HPET = HPET, IOAPIC = IOAPIC, PAE = PAE, RTC = RTC, X2APIC = X2APIC, biosAPICmode = biosAPICmode, bootDevice1 = bootDevice1, bootDevice2 = bootDevice2, bootDevice3 = bootDevice3, bootDevice4 = bootDevice4, bootMenuMode = bootMenuMode, chipset = chipset, configFile = configFile, cpuExepCap = cpuExepCap, cpuProfile = cpuProfile, cpus = cpus, firmware = firmware, guestOS = guestOS, hardwareUUID = hardwareUUID, id = id, logFolder = logFolder, longMode = longMode, memory = memory, name = name, pageFusion = pageFusion, running = running, runningSince = runningSince, snapshotFolder = snapshotFolder, started = started, stopped = stopped, stoppedSince = stoppedSince, timeOffset = timeOffset, tripleFaultReset = tripleFaultReset, vram = vram)
  
    __obj.asInstanceOf[VboxInfoData]
  }
}

