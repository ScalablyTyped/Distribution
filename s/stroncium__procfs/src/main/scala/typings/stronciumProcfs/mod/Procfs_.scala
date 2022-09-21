package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stroncium/procfs", "Procfs")
@js.native
open class Procfs_ () extends StObject {
  def this(root: String) = this()
  
  def cgroups(): js.Array[CgroupController] = js.native
  
  def cmdline(): String = js.native
  
  def config(): String = js.native
  
  def cpuinfo(): js.Array[CpuCoreInfo] = js.native
  
  def devIdFromMajorMinor(major: Double, minor: Double): Double = js.native
  
  def devIdGetMajor(devId: Double): Double = js.native
  
  def devIdGetMinor(devId: Double): Double = js.native
  
  def devices(): js.Array[Device] = js.native
  
  def diskstats(): js.Array[Diskstat] = js.native
  
  def filesystems(): js.Array[Filesystem] = js.native
  
  def loadavg(): Loadavg = js.native
  
  def meminfo(): Meminfo = js.native
  
  def netDev(): js.Array[NetDevice] = js.native
  
  def netTcp4(): js.Array[NetSocket4] = js.native
  
  def netTcp6(): js.Array[NetSocket6] = js.native
  
  def netUdp4(): js.Array[NetSocket4] = js.native
  
  def netUdp6(): js.Array[NetSocket6] = js.native
  
  def netUnix(): js.Array[NetUnixSocket] = js.native
  
  def netWireless(): js.Array[NetWirelessDevice] = js.native
  
  def partitions(): js.Array[Partition] = js.native
  
  def processAutogroup(): ProcessAutogroup = js.native
  def processAutogroup(pid: Double): ProcessAutogroup = js.native
  
  def processCgroups(): js.Array[ProcessCgroup] = js.native
  def processCgroups(pid: Double): js.Array[ProcessCgroup] = js.native
  
  def processCmdline(): js.Array[String] = js.native
  def processCmdline(pid: Double): js.Array[String] = js.native
  
  def processComm(): String = js.native
  def processComm(pid: Double): String = js.native
  
  def processCpuset(): String = js.native
  def processCpuset(pid: Double): String = js.native
  
  def processCwd(): String = js.native
  def processCwd(pid: Double): String = js.native
  
  def processEnviron(): js.Array[js.Array[String]] = js.native
  def processEnviron(pid: Double): js.Array[js.Array[String]] = js.native
  
  def processExe(): ProcessExe = js.native
  def processExe(pid: Double): ProcessExe = js.native
  
  def processFd(fd: Double): ProcessFd = js.native
  def processFd(fd: Double, pid: Double): ProcessFd = js.native
  
  def processFdinfo(fd: Double): ProcessFdinfo = js.native
  def processFdinfo(fd: Double, pid: Double): ProcessFdinfo = js.native
  
  def processFds(): js.Array[Double] = js.native
  def processFds(pid: Double): js.Array[Double] = js.native
  
  def processGidMap(): js.Array[ProcessIdMapRange] = js.native
  def processGidMap(pid: Double): js.Array[ProcessIdMapRange] = js.native
  
  def processIo(): ProcessIo = js.native
  def processIo(pid: Double): ProcessIo = js.native
  
  def processLimits(): js.Array[ProcessLimit] = js.native
  def processLimits(pid: Double): js.Array[ProcessLimit] = js.native
  
  def processMountinfo(): ProcessMountinfo = js.native
  def processMountinfo(pid: Double): ProcessMountinfo = js.native
  
  def processNetDev(): js.Array[NetDevice] = js.native
  def processNetDev(pid: Double): js.Array[NetDevice] = js.native
  
  def processNetTcp4(): js.Array[NetSocket4] = js.native
  def processNetTcp4(pid: Double): js.Array[NetSocket4] = js.native
  
  def processNetTcp6(): js.Array[NetSocket6] = js.native
  def processNetTcp6(pid: Double): js.Array[NetSocket6] = js.native
  
  def processNetUdp4(): js.Array[NetSocket4] = js.native
  def processNetUdp4(pid: Double): js.Array[NetSocket4] = js.native
  
  def processNetUdp6(): js.Array[NetSocket6] = js.native
  def processNetUdp6(pid: Double): js.Array[NetSocket6] = js.native
  
  def processNetUnix(): js.Array[NetUnixSocket] = js.native
  def processNetUnix(pid: Double): js.Array[NetUnixSocket] = js.native
  
  def processNetWireless(): js.Array[NetWirelessDevice] = js.native
  def processNetWireless(pid: Double): js.Array[NetWirelessDevice] = js.native
  
  def processOomScore(): Double = js.native
  def processOomScore(pid: Double): Double = js.native
  
  def processPersonality(): Double = js.native
  def processPersonality(pid: Double): Double = js.native
  
  def processStat(): ProcessStat = js.native
  def processStat(pid: Double): ProcessStat = js.native
  
  def processStatm(): ProcessStatm = js.native
  def processStatm(pid: Double): ProcessStatm = js.native
  
  def processStatus(): ProcessStatus = js.native
  def processStatus(pid: Double): ProcessStatus = js.native
  
  def processThreads(): js.Array[Double] = js.native
  def processThreads(pid: Double): js.Array[Double] = js.native
  
  def processTimerslackNs(): Double = js.native
  def processTimerslackNs(pid: Double): Double = js.native
  
  def processUidMap(): js.Array[ProcessIdMapRange] = js.native
  def processUidMap(pid: Double): js.Array[ProcessIdMapRange] = js.native
  
  def processes(): js.Array[Double] = js.native
  
  def stat(): Stat = js.native
  
  def swaps(): js.Array[Swap] = js.native
  
  def uptime(): Uptime = js.native
  
  def version(): String = js.native
}
