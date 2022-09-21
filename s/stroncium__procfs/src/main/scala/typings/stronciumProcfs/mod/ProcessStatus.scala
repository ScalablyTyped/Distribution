package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessStatus extends StObject {
  
  var contextSwitchesNonvoluntary: Double
  
  var contextSwitchesVoluntary: Double
  
  var cpusAllowedMask: Double
  
  var fdSlots: Double
  
  var gidEffective: Double
  
  var gidFilesystem: Double
  
  var gidReal: Double
  
  var gidSavedSet: Double
  
  var groups: js.Array[Double]
  
  var hugetlbPagesSize: Double
  
  var memoriesAllowedMask: Double
  
  var name: String
  
  var namespacePids: js.UndefOr[js.Array[Double]] = js.undefined
  
  var namespaceProcessGroupIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  var namespaceSessionIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  var namespaceThreadGroupIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  var numaGroupId: Double
  
  var parentPid: Double
  
  var pid: Double
  
  var rssAnon: js.UndefOr[Double] = js.undefined
  
  var rssFile: js.UndefOr[Double] = js.undefined
  
  var rssShmem: js.UndefOr[Double] = js.undefined
  
  var rtSignalsBlocked: Double
  
  var rtSignalsCaught: Double
  
  var rtSignalsIgnored: Double
  
  var seccompMode: js.UndefOr[Double] = js.undefined
  
  var sharedSignalsPending: Double
  
  var signalsBlocked: Double
  
  var signalsCaught: Double
  
  var signalsIgnored: Double
  
  var signalsPending: Double
  
  var signalsQueued: Double
  
  var signalsQueuedLimit: Double
  
  var speculationStoreBypass: js.UndefOr[String] = js.undefined
  
  var state: ProcessState
  
  var threadGroupId: Double
  
  var threads: Double
  
  var tracerPid: Double
  
  var uidEffective: Double
  
  var uidFilesystem: Double
  
  var uidReal: Double
  
  var uidSavedSet: Double
  
  var umask: js.UndefOr[Double] = js.undefined
  
  var vmData: Double
  
  var vmExe: Double
  
  var vmHwm: Double
  
  var vmLib: Double
  
  var vmLocked: Double
  
  var vmPeak: Double
  
  var vmPinned: Double
  
  var vmPte: Double
  
  var vmRss: Double
  
  var vmSize: Double
  
  var vmStack: Double
  
  var vmSwap: Double
}
object ProcessStatus {
  
  inline def apply(
    contextSwitchesNonvoluntary: Double,
    contextSwitchesVoluntary: Double,
    cpusAllowedMask: Double,
    fdSlots: Double,
    gidEffective: Double,
    gidFilesystem: Double,
    gidReal: Double,
    gidSavedSet: Double,
    groups: js.Array[Double],
    hugetlbPagesSize: Double,
    memoriesAllowedMask: Double,
    name: String,
    numaGroupId: Double,
    parentPid: Double,
    pid: Double,
    rtSignalsBlocked: Double,
    rtSignalsCaught: Double,
    rtSignalsIgnored: Double,
    sharedSignalsPending: Double,
    signalsBlocked: Double,
    signalsCaught: Double,
    signalsIgnored: Double,
    signalsPending: Double,
    signalsQueued: Double,
    signalsQueuedLimit: Double,
    state: ProcessState,
    threadGroupId: Double,
    threads: Double,
    tracerPid: Double,
    uidEffective: Double,
    uidFilesystem: Double,
    uidReal: Double,
    uidSavedSet: Double,
    vmData: Double,
    vmExe: Double,
    vmHwm: Double,
    vmLib: Double,
    vmLocked: Double,
    vmPeak: Double,
    vmPinned: Double,
    vmPte: Double,
    vmRss: Double,
    vmSize: Double,
    vmStack: Double,
    vmSwap: Double
  ): ProcessStatus = {
    val __obj = js.Dynamic.literal(contextSwitchesNonvoluntary = contextSwitchesNonvoluntary.asInstanceOf[js.Any], contextSwitchesVoluntary = contextSwitchesVoluntary.asInstanceOf[js.Any], cpusAllowedMask = cpusAllowedMask.asInstanceOf[js.Any], fdSlots = fdSlots.asInstanceOf[js.Any], gidEffective = gidEffective.asInstanceOf[js.Any], gidFilesystem = gidFilesystem.asInstanceOf[js.Any], gidReal = gidReal.asInstanceOf[js.Any], gidSavedSet = gidSavedSet.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], hugetlbPagesSize = hugetlbPagesSize.asInstanceOf[js.Any], memoriesAllowedMask = memoriesAllowedMask.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], numaGroupId = numaGroupId.asInstanceOf[js.Any], parentPid = parentPid.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], rtSignalsBlocked = rtSignalsBlocked.asInstanceOf[js.Any], rtSignalsCaught = rtSignalsCaught.asInstanceOf[js.Any], rtSignalsIgnored = rtSignalsIgnored.asInstanceOf[js.Any], sharedSignalsPending = sharedSignalsPending.asInstanceOf[js.Any], signalsBlocked = signalsBlocked.asInstanceOf[js.Any], signalsCaught = signalsCaught.asInstanceOf[js.Any], signalsIgnored = signalsIgnored.asInstanceOf[js.Any], signalsPending = signalsPending.asInstanceOf[js.Any], signalsQueued = signalsQueued.asInstanceOf[js.Any], signalsQueuedLimit = signalsQueuedLimit.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], threadGroupId = threadGroupId.asInstanceOf[js.Any], threads = threads.asInstanceOf[js.Any], tracerPid = tracerPid.asInstanceOf[js.Any], uidEffective = uidEffective.asInstanceOf[js.Any], uidFilesystem = uidFilesystem.asInstanceOf[js.Any], uidReal = uidReal.asInstanceOf[js.Any], uidSavedSet = uidSavedSet.asInstanceOf[js.Any], vmData = vmData.asInstanceOf[js.Any], vmExe = vmExe.asInstanceOf[js.Any], vmHwm = vmHwm.asInstanceOf[js.Any], vmLib = vmLib.asInstanceOf[js.Any], vmLocked = vmLocked.asInstanceOf[js.Any], vmPeak = vmPeak.asInstanceOf[js.Any], vmPinned = vmPinned.asInstanceOf[js.Any], vmPte = vmPte.asInstanceOf[js.Any], vmRss = vmRss.asInstanceOf[js.Any], vmSize = vmSize.asInstanceOf[js.Any], vmStack = vmStack.asInstanceOf[js.Any], vmSwap = vmSwap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessStatus]
  }
  
  extension [Self <: ProcessStatus](x: Self) {
    
    inline def setContextSwitchesNonvoluntary(value: Double): Self = StObject.set(x, "contextSwitchesNonvoluntary", value.asInstanceOf[js.Any])
    
    inline def setContextSwitchesVoluntary(value: Double): Self = StObject.set(x, "contextSwitchesVoluntary", value.asInstanceOf[js.Any])
    
    inline def setCpusAllowedMask(value: Double): Self = StObject.set(x, "cpusAllowedMask", value.asInstanceOf[js.Any])
    
    inline def setFdSlots(value: Double): Self = StObject.set(x, "fdSlots", value.asInstanceOf[js.Any])
    
    inline def setGidEffective(value: Double): Self = StObject.set(x, "gidEffective", value.asInstanceOf[js.Any])
    
    inline def setGidFilesystem(value: Double): Self = StObject.set(x, "gidFilesystem", value.asInstanceOf[js.Any])
    
    inline def setGidReal(value: Double): Self = StObject.set(x, "gidReal", value.asInstanceOf[js.Any])
    
    inline def setGidSavedSet(value: Double): Self = StObject.set(x, "gidSavedSet", value.asInstanceOf[js.Any])
    
    inline def setGroups(value: js.Array[Double]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: Double*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setHugetlbPagesSize(value: Double): Self = StObject.set(x, "hugetlbPagesSize", value.asInstanceOf[js.Any])
    
    inline def setMemoriesAllowedMask(value: Double): Self = StObject.set(x, "memoriesAllowedMask", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespacePids(value: js.Array[Double]): Self = StObject.set(x, "namespacePids", value.asInstanceOf[js.Any])
    
    inline def setNamespacePidsUndefined: Self = StObject.set(x, "namespacePids", js.undefined)
    
    inline def setNamespacePidsVarargs(value: Double*): Self = StObject.set(x, "namespacePids", js.Array(value*))
    
    inline def setNamespaceProcessGroupIds(value: js.Array[Double]): Self = StObject.set(x, "namespaceProcessGroupIds", value.asInstanceOf[js.Any])
    
    inline def setNamespaceProcessGroupIdsUndefined: Self = StObject.set(x, "namespaceProcessGroupIds", js.undefined)
    
    inline def setNamespaceProcessGroupIdsVarargs(value: Double*): Self = StObject.set(x, "namespaceProcessGroupIds", js.Array(value*))
    
    inline def setNamespaceSessionIds(value: js.Array[Double]): Self = StObject.set(x, "namespaceSessionIds", value.asInstanceOf[js.Any])
    
    inline def setNamespaceSessionIdsUndefined: Self = StObject.set(x, "namespaceSessionIds", js.undefined)
    
    inline def setNamespaceSessionIdsVarargs(value: Double*): Self = StObject.set(x, "namespaceSessionIds", js.Array(value*))
    
    inline def setNamespaceThreadGroupIds(value: js.Array[Double]): Self = StObject.set(x, "namespaceThreadGroupIds", value.asInstanceOf[js.Any])
    
    inline def setNamespaceThreadGroupIdsUndefined: Self = StObject.set(x, "namespaceThreadGroupIds", js.undefined)
    
    inline def setNamespaceThreadGroupIdsVarargs(value: Double*): Self = StObject.set(x, "namespaceThreadGroupIds", js.Array(value*))
    
    inline def setNumaGroupId(value: Double): Self = StObject.set(x, "numaGroupId", value.asInstanceOf[js.Any])
    
    inline def setParentPid(value: Double): Self = StObject.set(x, "parentPid", value.asInstanceOf[js.Any])
    
    inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setRssAnon(value: Double): Self = StObject.set(x, "rssAnon", value.asInstanceOf[js.Any])
    
    inline def setRssAnonUndefined: Self = StObject.set(x, "rssAnon", js.undefined)
    
    inline def setRssFile(value: Double): Self = StObject.set(x, "rssFile", value.asInstanceOf[js.Any])
    
    inline def setRssFileUndefined: Self = StObject.set(x, "rssFile", js.undefined)
    
    inline def setRssShmem(value: Double): Self = StObject.set(x, "rssShmem", value.asInstanceOf[js.Any])
    
    inline def setRssShmemUndefined: Self = StObject.set(x, "rssShmem", js.undefined)
    
    inline def setRtSignalsBlocked(value: Double): Self = StObject.set(x, "rtSignalsBlocked", value.asInstanceOf[js.Any])
    
    inline def setRtSignalsCaught(value: Double): Self = StObject.set(x, "rtSignalsCaught", value.asInstanceOf[js.Any])
    
    inline def setRtSignalsIgnored(value: Double): Self = StObject.set(x, "rtSignalsIgnored", value.asInstanceOf[js.Any])
    
    inline def setSeccompMode(value: Double): Self = StObject.set(x, "seccompMode", value.asInstanceOf[js.Any])
    
    inline def setSeccompModeUndefined: Self = StObject.set(x, "seccompMode", js.undefined)
    
    inline def setSharedSignalsPending(value: Double): Self = StObject.set(x, "sharedSignalsPending", value.asInstanceOf[js.Any])
    
    inline def setSignalsBlocked(value: Double): Self = StObject.set(x, "signalsBlocked", value.asInstanceOf[js.Any])
    
    inline def setSignalsCaught(value: Double): Self = StObject.set(x, "signalsCaught", value.asInstanceOf[js.Any])
    
    inline def setSignalsIgnored(value: Double): Self = StObject.set(x, "signalsIgnored", value.asInstanceOf[js.Any])
    
    inline def setSignalsPending(value: Double): Self = StObject.set(x, "signalsPending", value.asInstanceOf[js.Any])
    
    inline def setSignalsQueued(value: Double): Self = StObject.set(x, "signalsQueued", value.asInstanceOf[js.Any])
    
    inline def setSignalsQueuedLimit(value: Double): Self = StObject.set(x, "signalsQueuedLimit", value.asInstanceOf[js.Any])
    
    inline def setSpeculationStoreBypass(value: String): Self = StObject.set(x, "speculationStoreBypass", value.asInstanceOf[js.Any])
    
    inline def setSpeculationStoreBypassUndefined: Self = StObject.set(x, "speculationStoreBypass", js.undefined)
    
    inline def setState(value: ProcessState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setThreadGroupId(value: Double): Self = StObject.set(x, "threadGroupId", value.asInstanceOf[js.Any])
    
    inline def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    inline def setTracerPid(value: Double): Self = StObject.set(x, "tracerPid", value.asInstanceOf[js.Any])
    
    inline def setUidEffective(value: Double): Self = StObject.set(x, "uidEffective", value.asInstanceOf[js.Any])
    
    inline def setUidFilesystem(value: Double): Self = StObject.set(x, "uidFilesystem", value.asInstanceOf[js.Any])
    
    inline def setUidReal(value: Double): Self = StObject.set(x, "uidReal", value.asInstanceOf[js.Any])
    
    inline def setUidSavedSet(value: Double): Self = StObject.set(x, "uidSavedSet", value.asInstanceOf[js.Any])
    
    inline def setUmask(value: Double): Self = StObject.set(x, "umask", value.asInstanceOf[js.Any])
    
    inline def setUmaskUndefined: Self = StObject.set(x, "umask", js.undefined)
    
    inline def setVmData(value: Double): Self = StObject.set(x, "vmData", value.asInstanceOf[js.Any])
    
    inline def setVmExe(value: Double): Self = StObject.set(x, "vmExe", value.asInstanceOf[js.Any])
    
    inline def setVmHwm(value: Double): Self = StObject.set(x, "vmHwm", value.asInstanceOf[js.Any])
    
    inline def setVmLib(value: Double): Self = StObject.set(x, "vmLib", value.asInstanceOf[js.Any])
    
    inline def setVmLocked(value: Double): Self = StObject.set(x, "vmLocked", value.asInstanceOf[js.Any])
    
    inline def setVmPeak(value: Double): Self = StObject.set(x, "vmPeak", value.asInstanceOf[js.Any])
    
    inline def setVmPinned(value: Double): Self = StObject.set(x, "vmPinned", value.asInstanceOf[js.Any])
    
    inline def setVmPte(value: Double): Self = StObject.set(x, "vmPte", value.asInstanceOf[js.Any])
    
    inline def setVmRss(value: Double): Self = StObject.set(x, "vmRss", value.asInstanceOf[js.Any])
    
    inline def setVmSize(value: Double): Self = StObject.set(x, "vmSize", value.asInstanceOf[js.Any])
    
    inline def setVmStack(value: Double): Self = StObject.set(x, "vmStack", value.asInstanceOf[js.Any])
    
    inline def setVmSwap(value: Double): Self = StObject.set(x, "vmSwap", value.asInstanceOf[js.Any])
  }
}
