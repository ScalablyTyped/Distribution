package typings.atUirouterAngularjs

import org.scalablytyped.runtime.StringDictionary
import typings.atUirouterAngularjs.libInterfaceMod.Ng1ViewDeclaration
import typings.atUirouterAngularjs.libTemplateFactoryMod.TemplateFactory
import typings.atUirouterCore.atUirouterCoreMod.PathNode
import typings.atUirouterCore.atUirouterCoreMod.ResolveContext
import typings.atUirouterCore.atUirouterCoreMod.StateObject
import typings.atUirouterCore.libCommonCommonMod.IInjectable
import typings.atUirouterCore.libViewInterfaceMod.ViewConfig
import typings.atUirouterCore.libViewViewMod.ViewConfigFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs/lib/statebuilders/views", JSImport.Namespace)
@js.native
object libStatebuildersViewsMod extends js.Object {
  @js.native
  class Ng1ViewConfig protected () extends ViewConfig {
    def this(path: js.Array[PathNode], viewDecl: Ng1ViewDeclaration, factory: TemplateFactory) = this()
    var component: String = js.native
    var controller: js.Function = js.native
    var factory: TemplateFactory = js.native
    var locals: js.Any = js.native
    @JSName("path")
    var path_Ng1ViewConfig: js.Array[PathNode] = js.native
    var template: String = js.native
    @JSName("viewDecl")
    var viewDecl_Ng1ViewConfig: Ng1ViewDeclaration = js.native
    /**
      * Gets the controller for a view configuration.
      *
      * @returns {Function|Promise.<Function>} Returns a controller, or a promise that resolves to a controller.
      */
    def getController(context: ResolveContext): IInjectable | String | (js.Promise[IInjectable | String]) = js.native
    def getTemplate(uiView: js.Any, context: ResolveContext): String = js.native
  }
  
  def getNg1ViewConfigFactory(): ViewConfigFactory = js.native
  def ng1ViewsBuilder(state: StateObject): StringDictionary[Ng1ViewDeclaration] = js.native
}

