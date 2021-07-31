package typings.winrt.Windows.Web.Syndication

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SyndicationTextType extends StObject
@JSGlobal("Windows.Web.Syndication.SyndicationTextType")
@js.native
object SyndicationTextType extends StObject {
  
  @js.native
  sealed trait html
    extends StObject
       with SyndicationTextType
  
  @js.native
  sealed trait text
    extends StObject
       with SyndicationTextType
  
  @js.native
  sealed trait xhtml
    extends StObject
       with SyndicationTextType
}
