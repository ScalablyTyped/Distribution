package typings.systeminformation.mod.Systeminformation

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
    val __obj = js.Dynamic.literal(ACPI = ACPI.asInstanceOf[js.Any], APIC = APIC.asInstanceOf[js.Any], HPET = HPET.asInstanceOf[js.Any], IOAPIC = IOAPIC.asInstanceOf[js.Any], PAE = PAE.asInstanceOf[js.Any], RTC = RTC.asInstanceOf[js.Any], X2APIC = X2APIC.asInstanceOf[js.Any], biosAPICmode = biosAPICmode.asInstanceOf[js.Any], bootDevice1 = bootDevice1.asInstanceOf[js.Any], bootDevice2 = bootDevice2.asInstanceOf[js.Any], bootDevice3 = bootDevice3.asInstanceOf[js.Any], bootDevice4 = bootDevice4.asInstanceOf[js.Any], bootMenuMode = bootMenuMode.asInstanceOf[js.Any], chipset = chipset.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], cpuExepCap = cpuExepCap.asInstanceOf[js.Any], cpuProfile = cpuProfile.asInstanceOf[js.Any], cpus = cpus.asInstanceOf[js.Any], firmware = firmware.asInstanceOf[js.Any], guestOS = guestOS.asInstanceOf[js.Any], hardwareUUID = hardwareUUID.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], logFolder = logFolder.asInstanceOf[js.Any], longMode = longMode.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pageFusion = pageFusion.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any], runningSince = runningSince.asInstanceOf[js.Any], snapshotFolder = snapshotFolder.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], stopped = stopped.asInstanceOf[js.Any], stoppedSince = stoppedSince.asInstanceOf[js.Any], timeOffset = timeOffset.asInstanceOf[js.Any], tripleFaultReset = tripleFaultReset.asInstanceOf[js.Any], vram = vram.asInstanceOf[js.Any])
    __obj.asInstanceOf[VboxInfoData]
  }
}

