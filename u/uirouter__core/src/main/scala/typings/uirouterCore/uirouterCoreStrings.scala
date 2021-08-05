package typings.uirouterCore

import typings.uirouterCore.resolveInterfaceMod.PolicyWhen
import typings.uirouterCore.resolveInterfaceMod._PolicyAsync
import typings.uirouterCore.urlInterfaceMod.UrlRuleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uirouterCoreStrings {
  
  @js.native
  sealed trait EAGER
    extends StObject
       with PolicyWhen
  inline def EAGER: EAGER = "EAGER".asInstanceOf[EAGER]
  
  @js.native
  sealed trait LAZY
    extends StObject
       with PolicyWhen
  inline def LAZY: LAZY = "LAZY".asInstanceOf[LAZY]
  
  @js.native
  sealed trait NOWAIT
    extends StObject
       with _PolicyAsync
  inline def NOWAIT: NOWAIT = "NOWAIT".asInstanceOf[NOWAIT]
  
  @js.native
  sealed trait OTHER
    extends StObject
       with UrlRuleType
  inline def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  
  @js.native
  sealed trait RAW
    extends StObject
       with UrlRuleType
  inline def RAW: RAW = "RAW".asInstanceOf[RAW]
  
  @js.native
  sealed trait REGEXP
    extends StObject
       with UrlRuleType
  inline def REGEXP: REGEXP = "REGEXP".asInstanceOf[REGEXP]
  
  @js.native
  sealed trait STATE
    extends StObject
       with UrlRuleType
  inline def STATE: STATE = "STATE".asInstanceOf[STATE]
  
  @js.native
  sealed trait SameAsCurrent extends StObject
  inline def SameAsCurrent: SameAsCurrent = "SameAsCurrent".asInstanceOf[SameAsCurrent]
  
  @js.native
  sealed trait SameAsPending extends StObject
  inline def SameAsPending: SameAsPending = "SameAsPending".asInstanceOf[SameAsPending]
  
  @js.native
  sealed trait URLMATCHER
    extends StObject
       with UrlRuleType
  inline def URLMATCHER: URLMATCHER = "URLMATCHER".asInstanceOf[URLMATCHER]
  
  @js.native
  sealed trait WAIT
    extends StObject
       with _PolicyAsync
  inline def WAIT: WAIT = "WAIT".asInstanceOf[WAIT]
  
  @js.native
  sealed trait auto extends StObject
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait deregistered extends StObject
  inline def deregistered: deregistered = "deregistered".asInstanceOf[deregistered]
  
  @js.native
  sealed trait otherwise extends StObject
  inline def otherwise: otherwise = "otherwise".asInstanceOf[otherwise]
  
  @js.native
  sealed trait redirect extends StObject
  inline def redirect: redirect = "redirect".asInstanceOf[redirect]
  
  @js.native
  sealed trait registered extends StObject
  inline def registered: registered = "registered".asInstanceOf[registered]
  
  @js.native
  sealed trait replace extends StObject
  inline def replace: replace = "replace".asInstanceOf[replace]
  
  @js.native
  sealed trait sref extends StObject
  inline def sref: sref = "sref".asInstanceOf[sref]
  
  @js.native
  sealed trait unknown extends StObject
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait url extends StObject
  inline def url: url = "url".asInstanceOf[url]
}
