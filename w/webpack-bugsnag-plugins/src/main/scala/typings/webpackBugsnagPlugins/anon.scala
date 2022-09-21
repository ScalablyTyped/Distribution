package typings.webpackBugsnagPlugins

import typings.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.`bitbucket-server`
import typings.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.`github-enterprise`
import typings.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.`gitlab-onpremise`
import typings.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.bitbucket
import typings.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.github
import typings.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.gitlab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Debug extends StObject {
    
    var debug: js.UndefOr[Any] = js.undefined
    
    var error: js.UndefOr[Any] = js.undefined
    
    var info: js.UndefOr[Any] = js.undefined
    
    var warn: js.UndefOr[Any] = js.undefined
  }
  object Debug {
    
    inline def apply(): Debug = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Debug]
    }
    
    extension [Self <: Debug](x: Self) {
      
      inline def setDebug(value: Any): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInfo(value: Any): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setWarn(value: Any): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
  
  trait Provider extends StObject {
    
    /**
      *  The source control provider.
      */
    var provider: github | `github-enterprise` | gitlab | `gitlab-onpremise` | bitbucket | `bitbucket-server`
    
    /**
      * A URL (git/ssh/https) pointing to the repository, or webpage representing
      * the repository
      */
    var repository: String
    
    /**
      * The unique identifier for the commit (e.g. git SHA)
      */
    var revision: String
  }
  object Provider {
    
    inline def apply(
      provider: github | `github-enterprise` | gitlab | `gitlab-onpremise` | bitbucket | `bitbucket-server`,
      repository: String,
      revision: String
    ): Provider = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
      __obj.asInstanceOf[Provider]
    }
    
    extension [Self <: Provider](x: Self) {
      
      inline def setProvider(value: github | `github-enterprise` | gitlab | `gitlab-onpremise` | bitbucket | `bitbucket-server`): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    }
  }
}
