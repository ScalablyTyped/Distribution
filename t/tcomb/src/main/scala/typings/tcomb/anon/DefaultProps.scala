package typings.tcomb.anon

import typings.tcomb.mod.StructProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultProps extends js.Object {
  
  var defaultProps: js.Object = js.native
  
  var identity: Boolean = js.native
  
  var kind: String = js.native
  
  var name: String = js.native
  
  var props: StructProps = js.native
  
  var strict: Boolean = js.native
}
object DefaultProps {
  
  @scala.inline
  def apply(
    defaultProps: js.Object,
    identity: Boolean,
    kind: String,
    name: String,
    props: StructProps,
    strict: Boolean
  ): DefaultProps = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultProps]
  }
  
  @scala.inline
  implicit class DefaultPropsOps[Self <: DefaultProps] (val x: Self) extends AnyVal {
    
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
    def setDefaultProps(value: js.Object): Self = this.set("defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentity(value: Boolean): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: StructProps): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
  }
}
