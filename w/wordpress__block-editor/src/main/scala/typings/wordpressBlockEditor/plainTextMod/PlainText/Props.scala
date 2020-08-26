package typings.wordpressBlockEditor.plainTextMod.PlainText

import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TextareaAutosize.Props * / any, 'onChange'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TextareaAutosize.Props * / any[P]} */ @js.native
trait Props extends js.Object {
  /**
    * The component forwards the `ref` property to the `TextareaAutosize` component.
    */
  var ref: js.UndefOr[
    Ref[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextareaAutosize */ _
    ]
  ] = js.native
  /**
    * String value of the textarea
    */
  var value: String = js.native
  /**
    * Called when the value changes.
    */
  def onChange(value: String): Unit = js.native
}

object Props {
  @scala.inline
  def apply(onChange: String => Unit, value: String): Props = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setOnChange(value: String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefFunction1(
      value: /* instance */ (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextareaAutosize */ _) | Null => Unit
    ): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(
      value: Ref[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextareaAutosize */ _
        ]
    ): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
  
}

