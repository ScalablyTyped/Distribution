package typings.wordpressComponents.queryControlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object QueryControls {
  type CategoryProps = typings.wordpressComponents.anon.CategoriesList | js.Object
  type NumberProps = typings.wordpressComponents.anon.MaxItems | js.Object
  type OrderProps = typings.wordpressComponents.anon.OnOrderByChange | js.Object
  type Props = typings.wordpressComponents.queryControlsMod.QueryControls.CategoryProps with typings.wordpressComponents.queryControlsMod.QueryControls.OrderProps with typings.wordpressComponents.queryControlsMod.QueryControls.NumberProps
}
