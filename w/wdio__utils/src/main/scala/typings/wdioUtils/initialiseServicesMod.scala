package typings.wdioUtils

import typings.wdioUtils.anon.IgnoredWorkerServices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initialiseServicesMod {
  
  @JSImport("@wdio/utils/build/initialiseServices", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def initialiseLauncherService(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Config */ js.Any,
    caps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any
  ): IgnoredWorkerServices = (^.asInstanceOf[js.Dynamic].applyDynamic("initialiseLauncherService")(config.asInstanceOf[js.Any], caps.asInstanceOf[js.Any])).asInstanceOf[IgnoredWorkerServices]
  
  @scala.inline
  def initialiseWorkerService(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Config */ js.Any,
    caps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ServiceInstance */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialiseWorkerService")(config.asInstanceOf[js.Any], caps.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ServiceInstance */ js.Any
  ]]
  @scala.inline
  def initialiseWorkerService(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Config */ js.Any,
    caps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any,
    ignoredWorkerServices: js.Array[String]
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ServiceInstance */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialiseWorkerService")(config.asInstanceOf[js.Any], caps.asInstanceOf[js.Any], ignoredWorkerServices.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.ServiceInstance */ js.Any
  ]]
}
