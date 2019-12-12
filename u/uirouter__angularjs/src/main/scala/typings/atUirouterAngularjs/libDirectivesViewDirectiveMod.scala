package typings.atUirouterAngularjs

import typings.atUirouterAngularjs.libDirectivesStateDirectivesMod.ng1_directive
import typings.atUirouterAngularjs.libStatebuildersViewsMod.Ng1ViewConfig
import typings.atUirouterCore.libViewInterfaceMod.ActiveUIView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs/lib/directives/viewDirective", JSImport.Namespace)
@js.native
object libDirectivesViewDirectiveMod extends js.Object {
  @js.native
  trait UIViewAnimData extends js.Object {
    @JSName("$$animLeave")
    var $$animLeave: Anon_Resolve = js.native
    @JSName("$animEnter")
    var $animEnter: js.Promise[_] = js.native
    @JSName("$animLeave")
    var $animLeave: js.Promise[_] = js.native
  }
  
  @js.native
  trait UIViewData extends js.Object {
    @JSName("$cfg")
    var $cfg: Ng1ViewConfig = js.native
    @JSName("$uiView")
    var $uiView: ActiveUIView = js.native
  }
  
  var uiView: ng1_directive = js.native
}

