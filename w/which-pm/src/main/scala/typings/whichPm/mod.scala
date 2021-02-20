package typings.whichPm

import typings.whichPm.whichPmStrings.npm
import typings.whichPm.whichPmStrings.pnpm
import typings.whichPm.whichPmStrings.yarn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("which-pm", JSImport.Namespace)
  @js.native
  def apply(pkgPath: String): js.Promise[Result] = js.native
  
  @js.native
  trait NPM extends Result {
    
    val name: npm = js.native
  }
  object NPM {
    
    @scala.inline
    def apply(name: npm): NPM = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NPM]
    }
    
    @scala.inline
    implicit class NPMMutableBuilder[Self <: NPM] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: npm): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Other extends Result {
    
    val name: String = js.native
    
    val version: js.UndefOr[String] = js.native
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
  
  @js.native
  trait PNPM extends Result {
    
    val name: pnpm = js.native
    
    val version: String = js.native
  }
  object PNPM {
    
    @scala.inline
    def apply(name: pnpm, version: String): PNPM = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
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
    def NPM(name: npm): typings.whichPm.mod.NPM = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.whichPm.mod.NPM]
    }
    
    @scala.inline
    def Other(name: String): typings.whichPm.mod.Other = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.whichPm.mod.Other]
    }
    
    @scala.inline
    def PNPM(name: pnpm, version: String): typings.whichPm.mod.PNPM = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.whichPm.mod.PNPM]
    }
    
    @scala.inline
    def YARN(name: yarn): typings.whichPm.mod.YARN = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.whichPm.mod.YARN]
    }
  }
  
  @js.native
  trait YARN extends Result {
    
    val name: yarn = js.native
  }
  object YARN {
    
    @scala.inline
    def apply(name: yarn): YARN = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[YARN]
    }
    
    @scala.inline
    implicit class YARNMutableBuilder[Self <: YARN] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: yarn): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
