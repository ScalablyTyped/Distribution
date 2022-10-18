package typings.typesPkgJson

import org.scalablytyped.runtime.StringDictionary
import typings.typesPkgJson.buildUtilsMod.LiteralUnion
import typings.typesPkgJson.typesPkgJsonBooleans.`true`
import typings.typesPkgJson.typesPkgJsonStrings.corporation
import typings.typesPkgJson.typesPkgJsonStrings.foundation
import typings.typesPkgJson.typesPkgJsonStrings.git
import typings.typesPkgJson.typesPkgJsonStrings.github
import typings.typesPkgJson.typesPkgJsonStrings.individual
import typings.typesPkgJson.typesPkgJsonStrings.opencollective
import typings.typesPkgJson.typesPkgJsonStrings.patreon
import typings.typesPkgJson.typesPkgJsonStrings.svn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DictmoduleName
    extends StObject
       with /* moduleName */ StringDictionary[js.UndefOr[String]] {
    
    var browser: js.UndefOr[String] = js.undefined
    
    var main: js.UndefOr[String] = js.undefined
  }
  object DictmoduleName {
    
    inline def apply(): DictmoduleName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DictmoduleName]
    }
    
    extension [Self <: DictmoduleName](x: Self) {
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    }
  }
  
  trait Directory extends StObject {
    
    /**
      * Relative path to package.json if it is placed in non-root directory (for example if it is part of a monorepo).
      * [Read more.](https://github.com/npm/rfcs/blob/latest/implemented/0010-monorepo-subdirectory-declaration.md)
      */
    var directory: js.UndefOr[String] = js.undefined
    
    var `type`: LiteralUnion[git | svn, String]
    
    /**
      * A publicly available (perhaps read-only) url that can be handed directly to a VCS program without any modification.
      */
    var url: String
  }
  object Directory {
    
    inline def apply(`type`: LiteralUnion[git | svn, String], url: String): Directory = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Directory]
    }
    
    extension [Self <: Directory](x: Self) {
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      inline def setType(value: LiteralUnion[git | svn, String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Email extends StObject {
    
    /**
      * The email address to which issues should be reported.
      */
    var email: js.UndefOr[String] = js.undefined
    
    /**
      * The URL to the package's issue tracker.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object Email {
    
    inline def apply(): Email = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Email]
    }
    
    extension [Self <: Email](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Optional extends StObject {
    
    var optional: `true`
  }
  object Optional {
    
    inline def apply(): Optional = {
      val __obj = js.Dynamic.literal(optional = true)
      __obj.asInstanceOf[Optional]
    }
    
    extension [Self <: Optional](x: Self) {
      
      inline def setOptional(value: `true`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    /**
      * The type of funding.
      */
    var `type`: js.UndefOr[
        LiteralUnion[github | opencollective | patreon | individual | foundation | corporation, String]
      ] = js.undefined
    
    /**
      * The URL to the funding page.
      */
    var url: String
  }
  object Type {
    
    inline def apply(url: String): Type = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(
        value: LiteralUnion[github | opencollective | patreon | individual | foundation | corporation, String]
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait _empty extends StObject {
    
    @JSName("_")
    var _underscore: js.UndefOr[scala.Nothing] = js.undefined
  }
}
