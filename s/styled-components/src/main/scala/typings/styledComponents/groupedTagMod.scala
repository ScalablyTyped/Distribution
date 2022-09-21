package typings.styledComponents

import typings.styledComponents.anon.ClearGroup
import typings.styledComponents.typesMod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupedTagMod {
  
  @JSImport("styled-components/native/dist/dist/sheet/GroupedTag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeGroupedTag(tag: Tag): ClearGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("makeGroupedTag")(tag.asInstanceOf[js.Any]).asInstanceOf[ClearGroup]
}
