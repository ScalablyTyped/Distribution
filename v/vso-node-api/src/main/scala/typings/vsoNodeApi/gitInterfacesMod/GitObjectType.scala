package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitObjectType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitObjectType")
@js.native
object GitObjectType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitObjectType & Double] = js.native
  
  @js.native
  sealed trait Bad
    extends StObject
       with GitObjectType
  /* 0 */ val Bad: typings.vsoNodeApi.gitInterfacesMod.GitObjectType.Bad & Double = js.native
  
  @js.native
  sealed trait Blob
    extends StObject
       with GitObjectType
  /* 3 */ val Blob: typings.vsoNodeApi.gitInterfacesMod.GitObjectType.Blob & Double = js.native
  
  @js.native
  sealed trait Commit
    extends StObject
       with GitObjectType
  /* 1 */ val Commit: typings.vsoNodeApi.gitInterfacesMod.GitObjectType.Commit & Double = js.native
  
  @js.native
  sealed trait Ext2
    extends StObject
       with GitObjectType
  /* 5 */ val Ext2: typings.vsoNodeApi.gitInterfacesMod.GitObjectType.Ext2 & Double = js.native
  
  @js.native
  sealed trait OfsDelta
    extends StObject
       with GitObjectType
  /* 6 */ val OfsDelta: typings.vsoNodeApi.gitInterfacesMod.GitObjectType.OfsDelta & Double = js.native
  
  @js.native
  sealed trait RefDelta
    extends StObject
       with GitObjectType
  /* 7 */ val RefDelta: typings.vsoNodeApi.gitInterfacesMod.GitObjectType.RefDelta & Double = js.native
  
  @js.native
  sealed trait Tag
    extends StObject
       with GitObjectType
  /* 4 */ val Tag: typings.vsoNodeApi.gitInterfacesMod.GitObjectType.Tag & Double = js.native
  
  @js.native
  sealed trait Tree
    extends StObject
       with GitObjectType
  /* 2 */ val Tree: typings.vsoNodeApi.gitInterfacesMod.GitObjectType.Tree & Double = js.native
}
