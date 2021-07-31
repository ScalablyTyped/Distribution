package typings.webdriverio

import typings.webdriverio.severeServiceErrorMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("webdriverio/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webdriverio/build", "SevereServiceError")
  @js.native
  class SevereServiceError () extends default {
    def this(message: String) = this()
  }
  
  @scala.inline
  def attach(params: js.Any): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Client */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Client */ js.Any
  ]]
  
  @scala.inline
  def multiremote(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("multiremote")().asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def multiremote(params: js.Object): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("multiremote")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def multiremote(params: js.Object, config: js.Object): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiremote")(params.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def multiremote(params: Unit, config: js.Object): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiremote")(params.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def remote(params: js.Object, remoteModifier: js.Function): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("remote")(params.asInstanceOf[js.Any], remoteModifier.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def remote(params: Unit, remoteModifier: js.Function): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("remote")(params.asInstanceOf[js.Any], remoteModifier.asInstanceOf[js.Any])).asInstanceOf[js.Object]
}
