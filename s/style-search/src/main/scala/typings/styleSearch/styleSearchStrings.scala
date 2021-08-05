package typings.styleSearch

import typings.styleSearch.mod.SyntaxFeatureOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleSearchStrings {
  
  @js.native
  sealed trait check
    extends StObject
       with SyntaxFeatureOption
  inline def check: check = "check".asInstanceOf[check]
  
  @js.native
  sealed trait only
    extends StObject
       with SyntaxFeatureOption
  inline def only: only = "only".asInstanceOf[only]
  
  @js.native
  sealed trait skip
    extends StObject
       with SyntaxFeatureOption
  inline def skip: skip = "skip".asInstanceOf[skip]
}
