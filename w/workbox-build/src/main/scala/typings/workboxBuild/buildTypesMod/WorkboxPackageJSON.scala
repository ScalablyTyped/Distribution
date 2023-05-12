package typings.workboxBuild.buildTypesMod

import typings.typeFest.sourceBasicMod.JsonObject
import typings.typeFest.sourcePackageJsonMod.PackageJson.JSPMConfiguration
import typings.typeFest.sourcePackageJsonMod.PackageJson.NodeJsStandard
import typings.typeFest.sourcePackageJsonMod.PackageJson.NonStandardEntryPoints
import typings.typeFest.sourcePackageJsonMod.PackageJson.PackageJsonStandard
import typings.typeFest.sourcePackageJsonMod.PackageJson.TypeScriptConfiguration
import typings.typeFest.sourcePackageJsonMod.PackageJson.YarnConfiguration
import typings.workboxBuild.anon.BrowserNamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkboxPackageJSON
  extends StObject
     with JsonObject
     with NodeJsStandard
     with PackageJsonStandard
     with NonStandardEntryPoints
     with TypeScriptConfiguration
     with YarnConfiguration
     with JSPMConfiguration {
  
  var workbox: js.UndefOr[BrowserNamespace] = js.native
}
