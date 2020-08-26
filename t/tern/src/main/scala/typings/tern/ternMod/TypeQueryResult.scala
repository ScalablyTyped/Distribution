package typings.tern.ternMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeQueryResult extends js.Object {
  /** If the type had documentation associated with it, these will also be returned. */
  var doc: js.UndefOr[String] = js.native
  /** When the inspected expression was an identifier or a property access, this will hold the name of the variable or property. */
  var exprName: js.UndefOr[String] = js.native
  /** Whether the given type was guessed, or should be considered reliable. */
  var guess: Boolean = js.native
  /** The name associated with the type. */
  var name: js.UndefOr[String] = js.native
  /** If the type had origin information associated with it, these will also be returned. */
  var origin: js.UndefOr[String] = js.native
  /** A description of the type of the value. May be "?" when no type was found. */
  var `type`: String = js.native
  /** If the type had urls associated with it, these will also be returned. */
  var url: js.UndefOr[String] = js.native
}

object TypeQueryResult {
  @scala.inline
  def apply(guess: Boolean, `type`: String): TypeQueryResult = {
    val __obj = js.Dynamic.literal(guess = guess.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeQueryResult]
  }
  @scala.inline
  implicit class TypeQueryResultOps[Self <: TypeQueryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGuess(value: Boolean): Self = this.set("guess", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoc(value: String): Self = this.set("doc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoc: Self = this.set("doc", js.undefined)
    @scala.inline
    def setExprName(value: String): Self = this.set("exprName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExprName: Self = this.set("exprName", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

