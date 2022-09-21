package typings.typesPkgJson

import typings.typesPkgJson.fieldsMod.Dependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yarnMod {
  
  trait WorkspaceConfig extends StObject {
    
    /**
      * Designed to solve the problem of packages which break when their `node_modules` are moved to the root workspace directory - a process known as hoisting.
      * For these packages, both within your workspace, and also some that have been installed via `node_modules`,
      * it is important to have a mechanism for preventing the default Yarn workspace behavior.
      * By adding workspace pattern strings here, Yarn will resume non-workspace behavior for any package which matches the defined patterns.
      * [Read more](https://classic.yarnpkg.com/blog/2018/02/15/nohoist/)
      */
    var nohoist: js.UndefOr[js.Array[WorkspacePattern]] = js.undefined
    
    /**
      * An array of workspace pattern strings which contain the workspace packages.
      */
    var packages: js.UndefOr[js.Array[WorkspacePattern]] = js.undefined
  }
  object WorkspaceConfig {
    
    inline def apply(): WorkspaceConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceConfig]
    }
    
    extension [Self <: WorkspaceConfig](x: Self) {
      
      inline def setNohoist(value: js.Array[WorkspacePattern]): Self = StObject.set(x, "nohoist", value.asInstanceOf[js.Any])
      
      inline def setNohoistUndefined: Self = StObject.set(x, "nohoist", js.undefined)
      
      inline def setNohoistVarargs(value: WorkspacePattern*): Self = StObject.set(x, "nohoist", js.Array(value*))
      
      inline def setPackages(value: js.Array[WorkspacePattern]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
      
      inline def setPackagesVarargs(value: WorkspacePattern*): Self = StObject.set(x, "packages", js.Array(value*))
    }
  }
  
  type WorkspacePattern = String
  
  trait YarnConfiguration extends StObject {
    
    /**
      * If your package only allows one version of a given dependency, and you’d like to enforce the same behavior as `yarn install --flat` on the command-line, set this to `true`.
      * Note that if your `package.json` contains `"flat": true` and other packages depend on yours (e.g. you are building a library rather than an app),
      * those other packages will also need `"flat": true` in their `package.json` or be installed with `yarn install --flat` on the command-line.
      */
    var flat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Selective version resolutions. Allows the definition of custom package versions inside dependencies without manual edits in the `yarn.lock` file.
      */
    var resolutions: js.UndefOr[Dependencies] = js.undefined
    
    /**
      * Used to configure [Yarn workspaces](https://classic.yarnpkg.com/docs/workspaces/).
      * Workspaces allow you to manage multiple packages within the same repository in such a way that you only need to run `yarn install`
      * once to install all of them in a single pass. Please note that the top-level `private` property of `package.json` **must** be set to `true` in order to use workspaces.
      */
    var workspaces: js.UndefOr[js.Array[WorkspacePattern] | WorkspaceConfig] = js.undefined
  }
  object YarnConfiguration {
    
    inline def apply(): YarnConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YarnConfiguration]
    }
    
    extension [Self <: YarnConfiguration](x: Self) {
      
      inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setResolutions(value: Dependencies): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      inline def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
      
      inline def setWorkspaces(value: js.Array[WorkspacePattern] | WorkspaceConfig): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
      
      inline def setWorkspacesUndefined: Self = StObject.set(x, "workspaces", js.undefined)
      
      inline def setWorkspacesVarargs(value: WorkspacePattern*): Self = StObject.set(x, "workspaces", js.Array(value*))
    }
  }
}
