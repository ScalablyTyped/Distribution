package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitObjectType extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitObjectType")
@js.native
object GitObjectType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitObjectType with Double] = js.native
  
  @js.native
  sealed trait Bad extends GitObjectType
  /* 0 */ @js.native
  object Bad extends TopLevel[Bad with Double]
  
  @js.native
  sealed trait Blob extends GitObjectType
  /* 3 */ @js.native
  object Blob extends TopLevel[Blob with Double]
  
  @js.native
  sealed trait Commit extends GitObjectType
  /* 1 */ @js.native
  object Commit extends TopLevel[Commit with Double]
  
  @js.native
  sealed trait Ext2 extends GitObjectType
  /* 5 */ @js.native
  object Ext2 extends TopLevel[Ext2 with Double]
  
  @js.native
  sealed trait OfsDelta extends GitObjectType
  /* 6 */ @js.native
  object OfsDelta extends TopLevel[OfsDelta with Double]
  
  @js.native
  sealed trait RefDelta extends GitObjectType
  /* 7 */ @js.native
  object RefDelta extends TopLevel[RefDelta with Double]
  
  @js.native
  sealed trait Tag extends GitObjectType
  /* 4 */ @js.native
  object Tag extends TopLevel[Tag with Double]
  
  @js.native
  sealed trait Tree extends GitObjectType
  /* 2 */ @js.native
  object Tree extends TopLevel[Tree with Double]
}
