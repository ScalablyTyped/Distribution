package typings.vsoNodeApi.fileContainerInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContainerItemType extends js.Object
@JSImport("vso-node-api/interfaces/FileContainerInterfaces", "ContainerItemType")
@js.native
object ContainerItemType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContainerItemType with Double] = js.native
  
  /**
    * Any item type.
    */
  @js.native
  sealed trait Any extends ContainerItemType
  /* 0 */ @js.native
  object Any extends TopLevel[Any with Double]
  
  /**
    * Item is a file which is stored in the file service.
    */
  @js.native
  sealed trait File extends ContainerItemType
  /* 2 */ @js.native
  object File extends TopLevel[File with Double]
  
  /**
    * Item is a folder which can have child items.
    */
  @js.native
  sealed trait Folder extends ContainerItemType
  /* 1 */ @js.native
  object Folder extends TopLevel[Folder with Double]
}
