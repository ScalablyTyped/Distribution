package typings.tufJs

import typings.node.bufferMod.global.Buffer
import typings.tufjsModels.mod.Metadata
import typings.tufjsModels.mod.Root
import typings.tufjsModels.mod.Snapshot
import typings.tufjsModels.mod.Targets
import typings.tufjsModels.mod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStoreMod {
  
  @JSImport("tuf-js/dist/store", "TrustedMetadataStore")
  @js.native
  open class TrustedMetadataStore protected () extends StObject {
    def this(rootData: Buffer) = this()
    
    /* private */ var checkFinalSnapsnot: Any = js.native
    
    /* private */ var checkFinalTimestamp: Any = js.native
    
    def getRole(name: String): js.UndefOr[Metadata[Targets]] = js.native
    
    /* private */ var loadTrustedRoot: Any = js.native
    
    /* private */ var referenceTime: Any = js.native
    
    def root: Metadata[Root] = js.native
    
    def snapshot: js.UndefOr[Metadata[Snapshot]] = js.native
    
    def targets: js.UndefOr[Metadata[Targets]] = js.native
    
    def timestamp: js.UndefOr[Metadata[Timestamp]] = js.native
    
    /* private */ var trustedSet: Any = js.native
    
    def updateDelegatedTargets(bytesBuffer: Buffer, roleName: String, delegatorName: String): Unit = js.native
    
    def updateRoot(bytesBuffer: Buffer): Metadata[Root] = js.native
    
    def updateSnapshot(bytesBuffer: Buffer): Metadata[Snapshot] = js.native
    def updateSnapshot(bytesBuffer: Buffer, trusted: Boolean): Metadata[Snapshot] = js.native
    
    def updateTimestamp(bytesBuffer: Buffer): Metadata[Timestamp] = js.native
  }
}
