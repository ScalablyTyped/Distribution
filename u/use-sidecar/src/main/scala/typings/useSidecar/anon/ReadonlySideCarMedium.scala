package typings.useSidecar.anon

import typings.react.mod.ComponentType
import typings.useSidecar.typesMod.MediumCallback
import typings.useSidecar.typesMod.removeCb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<use-sidecar.use-sidecar/dist/es5/types.SideCarMedium> */
@js.native
trait ReadonlySideCarMedium extends js.Object {
  
  val assignMedium: js.Function1[/* handler */ MediumCallback[ComponentType[js.Object]], Unit] = js.native
  
  val assignSyncMedium: js.Function1[/* handler */ MediumCallback[ComponentType[js.Object]], Unit] = js.native
  
  val options: js.UndefOr[js.Object] = js.native
  
  val read: js.Function0[js.UndefOr[ComponentType[js.Object]]] = js.native
  
  val useMedium: js.Function1[/* effect */ ComponentType[js.Object], removeCb] = js.native
}
object ReadonlySideCarMedium {
  
  @scala.inline
  def apply(
    assignMedium: /* handler */ MediumCallback[ComponentType[js.Object]] => Unit,
    assignSyncMedium: /* handler */ MediumCallback[ComponentType[js.Object]] => Unit,
    read: () => js.UndefOr[ComponentType[js.Object]],
    useMedium: /* effect */ ComponentType[js.Object] => removeCb
  ): ReadonlySideCarMedium = {
    val __obj = js.Dynamic.literal(assignMedium = js.Any.fromFunction1(assignMedium), assignSyncMedium = js.Any.fromFunction1(assignSyncMedium), read = js.Any.fromFunction0(read), useMedium = js.Any.fromFunction1(useMedium))
    __obj.asInstanceOf[ReadonlySideCarMedium]
  }
  
  @scala.inline
  implicit class ReadonlySideCarMediumOps[Self <: ReadonlySideCarMedium] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssignMedium(value: /* handler */ MediumCallback[ComponentType[js.Object]] => Unit): Self = this.set("assignMedium", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAssignSyncMedium(value: /* handler */ MediumCallback[ComponentType[js.Object]] => Unit): Self = this.set("assignSyncMedium", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRead(value: () => js.UndefOr[ComponentType[js.Object]]): Self = this.set("read", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUseMedium(value: /* effect */ ComponentType[js.Object] => removeCb): Self = this.set("useMedium", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
