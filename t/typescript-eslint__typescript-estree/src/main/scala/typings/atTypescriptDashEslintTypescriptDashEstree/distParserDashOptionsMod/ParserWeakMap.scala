package typings.atTypescriptDashEslintTypescriptDashEstree.distParserDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserWeakMap[TKey, TValueBase] extends js.Object {
  def get[TValue /* <: TValueBase */](key: TKey): TValue
  def has(key: js.Any): Boolean
}

object ParserWeakMap {
  @scala.inline
  def apply[TKey, TValueBase](get: TKey => js.Any, has: js.Any => Boolean): ParserWeakMap[TKey, TValueBase] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
  
    __obj.asInstanceOf[ParserWeakMap[TKey, TValueBase]]
  }
}

