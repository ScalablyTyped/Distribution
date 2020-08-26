package typings.wordpressComponents

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.wordpressComponents.snackbarListMod.SnackbarList.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components/snackbar/list", JSImport.Namespace)
@js.native
object snackbarListMod extends js.Object {
  @js.native
  object SnackbarList extends js.Object {
    type Props = typings.wordpressComponents.listMod.NoticeList.Props
  }
  
  @js.native
  object default extends TopLevel[ComponentType[Props]]
  
}

