package typings.styledComponents

import typings.styledComponents.anon.GroupSizes
import typings.styledComponents.distSheetTypesMod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSheetGroupedTagMod {
  
  @JSImport("styled-components/primitives/dist/dist/sheet/GroupedTag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeGroupedTag(tag: Tag): GroupSizes = ^.asInstanceOf[js.Dynamic].applyDynamic("makeGroupedTag")(tag.asInstanceOf[js.Any]).asInstanceOf[GroupSizes]
}
