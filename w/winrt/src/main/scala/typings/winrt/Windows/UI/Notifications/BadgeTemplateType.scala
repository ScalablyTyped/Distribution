package typings.winrt.Windows.UI.Notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BadgeTemplateType extends StObject
@JSGlobal("Windows.UI.Notifications.BadgeTemplateType")
@js.native
object BadgeTemplateType extends StObject {
  
  @js.native
  sealed trait badgeGlyph
    extends StObject
       with BadgeTemplateType
  
  @js.native
  sealed trait badgeNumber
    extends StObject
       with BadgeTemplateType
}
