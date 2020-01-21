package typings.winrtUwp.Windows.Graphics.Printing3D

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Print3DTaskDetail extends js.Object

/** Specifies the type of errors encountered during a 3D print request. */
@JSGlobal("Windows.Graphics.Printing3D.Print3DTaskDetail")
@js.native
object Print3DTaskDetail extends js.Object {
  /** An invalid printing material has been selected. */
  @js.native
  sealed trait invalidMaterialSelection extends Print3DTaskDetail
  
  /** The 3D model is not valid. */
  @js.native
  sealed trait invalidModel extends Print3DTaskDetail
  
  /** The print ticket is not valid. */
  @js.native
  sealed trait invalidPrintTicket extends Print3DTaskDetail
  
  /** The 3D model exceeds the print bed. */
  @js.native
  sealed trait modelExceedsPrintBed extends Print3DTaskDetail
  
  /** The 3d model does not have manifold edges. */
  @js.native
  sealed trait modelNotManifold extends Print3DTaskDetail
  
  /** No additional information is available. */
  @js.native
  sealed trait unknown extends Print3DTaskDetail
  
  /** The upload of the 3D print package failed. */
  @js.native
  sealed trait uploadFailed extends Print3DTaskDetail
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Print3DTaskDetail with Double] = js.native
  /* 3 */ @js.native
  object invalidMaterialSelection extends TopLevel[invalidMaterialSelection with Double]
  
  /* 4 */ @js.native
  object invalidModel extends TopLevel[invalidModel with Double]
  
  /* 6 */ @js.native
  object invalidPrintTicket extends TopLevel[invalidPrintTicket with Double]
  
  /* 1 */ @js.native
  object modelExceedsPrintBed extends TopLevel[modelExceedsPrintBed with Double]
  
  /* 5 */ @js.native
  object modelNotManifold extends TopLevel[modelNotManifold with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 2 */ @js.native
  object uploadFailed extends TopLevel[uploadFailed with Double]
  
}

