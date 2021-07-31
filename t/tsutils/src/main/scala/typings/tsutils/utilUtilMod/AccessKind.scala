package typings.tsutils.utilUtilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AccessKind extends StObject
@JSImport("tsutils/util/util", "AccessKind")
@js.native
object AccessKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AccessKind & Double] = js.native
  
  @js.native
  sealed trait Delete
    extends StObject
       with AccessKind
  /* 4 */ val Delete: typings.tsutils.utilUtilMod.AccessKind.Delete & Double = js.native
  
  @js.native
  sealed trait Modification
    extends StObject
       with AccessKind
  /* 6 */ val Modification: typings.tsutils.utilUtilMod.AccessKind.Modification & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with AccessKind
  /* 0 */ val None: typings.tsutils.utilUtilMod.AccessKind.None & Double = js.native
  
  @js.native
  sealed trait Read
    extends StObject
       with AccessKind
  /* 1 */ val Read: typings.tsutils.utilUtilMod.AccessKind.Read & Double = js.native
  
  @js.native
  sealed trait ReadWrite
    extends StObject
       with AccessKind
  /* 3 */ val ReadWrite: typings.tsutils.utilUtilMod.AccessKind.ReadWrite & Double = js.native
  
  @js.native
  sealed trait Write
    extends StObject
       with AccessKind
  /* 2 */ val Write: typings.tsutils.utilUtilMod.AccessKind.Write & Double = js.native
}
