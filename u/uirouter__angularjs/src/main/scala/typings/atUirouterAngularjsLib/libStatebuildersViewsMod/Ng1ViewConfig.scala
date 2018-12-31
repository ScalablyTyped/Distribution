package typings
package atUirouterAngularjsLib.libStatebuildersViewsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs/lib/statebuilders/views", "Ng1ViewConfig")
@js.native
class Ng1ViewConfig protected ()
  extends atUirouterCoreLib.libViewInterfaceMod.ViewConfig {
  def this(path: js.Array[atUirouterCoreLib.coreMod.PathNode], viewDecl: atUirouterAngularjsLib.libInterfaceMod.Ng1ViewDeclaration, factory: atUirouterAngularjsLib.libTemplateFactoryMod.TemplateFactory) = this()
  /* CompleteClass */
  @JSName("$id")
  override var $id: scala.Double = js.native
  var component: java.lang.String = js.native
  var controller: angularLib.angularMod.Global.Function = js.native
  var factory: atUirouterAngularjsLib.libTemplateFactoryMod.TemplateFactory = js.native
  /* CompleteClass */
  override var loaded: scala.Boolean = js.native
  var locals: js.Any = js.native
  /** The node the ViewConfig is bound to */
  /* CompleteClass */
  override var path: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode] = js.native
  @JSName("path")
  var path_Ng1ViewConfig: js.Array[atUirouterCoreLib.coreMod.PathNode] = js.native
  var template: java.lang.String = js.native
  /** The normalized view declaration from [[State.views]] */
  /* CompleteClass */
  override var viewDecl: atUirouterCoreLib.libStateInterfaceMod._ViewDeclaration = js.native
  @JSName("viewDecl")
  var viewDecl_Ng1ViewConfig: atUirouterAngularjsLib.libInterfaceMod.Ng1ViewDeclaration = js.native
  /**
    * Gets the controller for a view configuration.
    *
    * @returns {Function|Promise.<Function>} Returns a controller, or a promise that resolves to a controller.
    */
  def getController(context: atUirouterCoreLib.coreMod.ResolveContext): atUirouterCoreLib.libCommonCommonMod.IInjectable | java.lang.String | (js.Promise[atUirouterCoreLib.libCommonCommonMod.IInjectable | java.lang.String]) = js.native
  def getTemplate(uiView: js.Any, context: atUirouterCoreLib.coreMod.ResolveContext): java.lang.String = js.native
  /** Fetches templates, runs dynamic (controller|template)Provider code, lazy loads Components, etc */
  /* CompleteClass */
  override def load(): js.Promise[atUirouterCoreLib.libViewInterfaceMod.ViewConfig] = js.native
}

