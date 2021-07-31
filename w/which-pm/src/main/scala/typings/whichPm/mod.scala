package typings.whichPm

import typings.whichPm.whichPmStrings.npm
import typings.whichPm.whichPmStrings.pnpm
import typings.whichPm.whichPmStrings.yarn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(pkgPath: String): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].apply(pkgPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  @JSImport("which-pm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait NPM
    extends StObject
       with Result {
    
    val name: npm
  }
  object NPM {
    
    @scala.inline
    def apply(): NPM = {
      val __obj = js.Dynamic.literal(name = "npm")
      __obj.asInstanceOf[NPM]
    }
    
    @scala.inline
    implicit class NPMMutableBuilder[Self <: NPM] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: npm): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Other
    extends StObject
       with Result {
    
    val name: String
    
    val version: js.UndefOr[String] = js.undefined
  }
  object Other {
    
    @scala.inline
    def apply(name: String): Other = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Other]
    }
    
    @scala.inline
    implicit class OtherMutableBuilder[Self <: Other] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait PNPM
    extends StObject
       with Result {
    
    val name: pnpm
    
    val version: String
  }
  object PNPM {
    
    @scala.inline
    def apply(version: String): PNPM = {
      val __obj = js.Dynamic.literal(name = "pnpm", version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PNPM]
    }
    
    @scala.inline
    implicit class PNPMMutableBuilder[Self <: PNPM] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: pnpm): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.whichPm.mod.NPM
    - typings.whichPm.mod.YARN
    - typings.whichPm.mod.PNPM
    - typings.whichPm.mod.Other
  */
  trait Result extends StObject
  object Result {
    
    @scala.inline
    def NPM(): typings.whichPm.mod.NPM = {
      val __obj = js.Dynamic.literal(name = "npm")
      __obj.asInstanceOf[typings.whichPm.mod.NPM]
    }
    
    @scala.inline
    def Other(name: String): typings.whichPm.mod.Other = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.whichPm.mod.Other]
    }
    
    @scala.inline
    def PNPM(version: String): typings.whichPm.mod.PNPM = {
      val __obj = js.Dynamic.literal(name = "pnpm", version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.whichPm.mod.PNPM]
    }
    
    @scala.inline
    def YARN(): typings.whichPm.mod.YARN = {
      val __obj = js.Dynamic.literal(name = "yarn")
      __obj.asInstanceOf[typings.whichPm.mod.YARN]
    }
  }
  
  trait YARN
    extends StObject
       with Result {
    
    val name: yarn
  }
  object YARN {
    
    @scala.inline
    def apply(): YARN = {
      val __obj = js.Dynamic.literal(name = "yarn")
      __obj.asInstanceOf[YARN]
    }
    
    @scala.inline
    implicit class YARNMutableBuilder[Self <: YARN] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: yarn): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
