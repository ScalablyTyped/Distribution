package typings.tuyaPanelKit.drawerRouterMod

import typings.std.Extract
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/TabRouter.TabActionHelpers<ParamList> & {openDrawer (): void, closeDrawer (): void, toggleDrawer (): void} */
@js.native
trait DrawerActionHelpers[ParamList /* <: ParamListBase */] extends js.Object {
  
  /**
    * Close the drawer sidebar.
    */
  def closeDrawer(): Unit = js.native
  
  /**
    * Jump to an existing tab.
    *
    * @param name Name of the route for the tab.
    * @param [params] Params object for the route.
    */
  // tslint:disable-next-line max-line-length
  def jumpTo[RouteName /* <: Extract[/* keyof ParamList */ String, String] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] is not an array type */ args: (js.Tuple2[
      RouteName, 
      /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ]) | js.Array[RouteName]
  ): Unit = js.native
  
  /**
    * Open the drawer sidebar.
    */
  def openDrawer(): Unit = js.native
  
  /**
    * Open the drawer sidebar if closed, or close if opened.
    */
  def toggleDrawer(): Unit = js.native
}
object DrawerActionHelpers {
  
  @scala.inline
  def apply[ParamList /* <: ParamListBase */](
    closeDrawer: () => Unit,
    jumpTo: (js.Tuple2[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ]) | js.Array[js.Any] => Unit,
    openDrawer: () => Unit,
    toggleDrawer: () => Unit
  ): DrawerActionHelpers[ParamList] = {
    val __obj = js.Dynamic.literal(closeDrawer = js.Any.fromFunction0(closeDrawer), jumpTo = js.Any.fromFunction1(jumpTo), openDrawer = js.Any.fromFunction0(openDrawer), toggleDrawer = js.Any.fromFunction0(toggleDrawer))
    __obj.asInstanceOf[DrawerActionHelpers[ParamList]]
  }
  
  @scala.inline
  implicit class DrawerActionHelpersOps[Self <: DrawerActionHelpers[_], ParamList /* <: ParamListBase */] (val x: Self with DrawerActionHelpers[ParamList]) extends AnyVal {
    
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
    def setCloseDrawer(value: () => Unit): Self = this.set("closeDrawer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJumpTo(
      value: (js.Tuple2[
          js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]) | js.Array[js.Any] => Unit
    ): Self = this.set("jumpTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenDrawer(value: () => Unit): Self = this.set("openDrawer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggleDrawer(value: () => Unit): Self = this.set("toggleDrawer", js.Any.fromFunction0(value))
  }
}
