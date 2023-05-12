package typings.tufjsModels

import typings.std.Record
import typings.tufjsModels.distBaseMod.Signed
import typings.tufjsModels.distBaseMod.SignedOptions
import typings.tufjsModels.distDelegationsMod.Delegations
import typings.tufjsModels.distFileMod.TargetFile
import typings.tufjsModels.distMetadataMod.MetadataType
import typings.tufjsModels.distUtilsTypesMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTargetsMod {
  
  @JSImport("@tufjs/models/dist/targets", "Targets")
  @js.native
  open class Targets protected ()
    extends Signed
       with MetadataType {
    def this(options: TargetsOptions) = this()
    
    def addTarget(target: TargetFile): Unit = js.native
    
    val delegations: js.UndefOr[Delegations] = js.native
    
    def equals(other: Targets): Boolean = js.native
    
    val targets: TargetFileMap = js.native
    
    val `type`: String | Double = js.native
  }
  /* static members */
  object Targets {
    
    @JSImport("@tufjs/models/dist/targets", "Targets")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: JSONObject): Targets = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[Targets]
  }
  
  type TargetFileMap = Record[String, TargetFile]
  
  trait TargetsOptions
    extends StObject
       with SignedOptions {
    
    var delegations: js.UndefOr[Delegations] = js.undefined
    
    var targets: js.UndefOr[TargetFileMap] = js.undefined
  }
  object TargetsOptions {
    
    inline def apply(): TargetsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TargetsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TargetsOptions] (val x: Self) extends AnyVal {
      
      inline def setDelegations(value: Delegations): Self = StObject.set(x, "delegations", value.asInstanceOf[js.Any])
      
      inline def setDelegationsUndefined: Self = StObject.set(x, "delegations", js.undefined)
      
      inline def setTargets(value: TargetFileMap): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    }
  }
}
