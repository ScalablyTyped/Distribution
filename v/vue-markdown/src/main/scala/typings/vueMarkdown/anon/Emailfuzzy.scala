package typings.vueMarkdown.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Emailfuzzy extends js.Object {
  
  var email_fuzzy: RegExp = js.native
  
  var host_fuzzy_test: RegExp = js.native
  
  var link_fuzzy: RegExp = js.native
  
  var link_no_ip_fuzzy: RegExp = js.native
  
  var pretest: RegExp = js.native
  
  var schema_search: RegExp = js.native
  
  var schema_test: RegExp = js.native
  
  var src_Any: String = js.native
  
  var src_Cc: String = js.native
  
  var src_P: String = js.native
  
  var src_Z: String = js.native
  
  var src_ZCc: String = js.native
  
  var src_ZPCc: String = js.native
  
  var src_auth: String = js.native
  
  var src_domain: String = js.native
  
  var src_domain_root: String = js.native
  
  var src_email_name: String = js.native
  
  var src_host: String = js.native
  
  var src_host_port_strict: String = js.native
  
  var src_host_strict: String = js.native
  
  var src_host_terminator: String = js.native
  
  var src_ip4: String = js.native
  
  var src_path: String = js.native
  
  var src_port: String = js.native
  
  var src_tlds: String = js.native
  
  var src_xn: String = js.native
  
  var tpl_email_fuzzy: String = js.native
  
  var tpl_host_fuzzy: String = js.native
  
  var tpl_host_fuzzy_strict: String = js.native
  
  var tpl_host_fuzzy_test: String = js.native
  
  var tpl_host_no_ip_fuzzy: String = js.native
  
  var tpl_host_port_fuzzy_strict: String = js.native
  
  var tpl_host_port_no_ip_fuzzy_strict: String = js.native
  
  var tpl_link_fuzzy: String = js.native
  
  var tpl_link_no_ip_fuzzy: String = js.native
}
object Emailfuzzy {
  
  @scala.inline
  def apply(
    email_fuzzy: RegExp,
    host_fuzzy_test: RegExp,
    link_fuzzy: RegExp,
    link_no_ip_fuzzy: RegExp,
    pretest: RegExp,
    schema_search: RegExp,
    schema_test: RegExp,
    src_Any: String,
    src_Cc: String,
    src_P: String,
    src_Z: String,
    src_ZCc: String,
    src_ZPCc: String,
    src_auth: String,
    src_domain: String,
    src_domain_root: String,
    src_email_name: String,
    src_host: String,
    src_host_port_strict: String,
    src_host_strict: String,
    src_host_terminator: String,
    src_ip4: String,
    src_path: String,
    src_port: String,
    src_tlds: String,
    src_xn: String,
    tpl_email_fuzzy: String,
    tpl_host_fuzzy: String,
    tpl_host_fuzzy_strict: String,
    tpl_host_fuzzy_test: String,
    tpl_host_no_ip_fuzzy: String,
    tpl_host_port_fuzzy_strict: String,
    tpl_host_port_no_ip_fuzzy_strict: String,
    tpl_link_fuzzy: String,
    tpl_link_no_ip_fuzzy: String
  ): Emailfuzzy = {
    val __obj = js.Dynamic.literal(email_fuzzy = email_fuzzy.asInstanceOf[js.Any], host_fuzzy_test = host_fuzzy_test.asInstanceOf[js.Any], link_fuzzy = link_fuzzy.asInstanceOf[js.Any], link_no_ip_fuzzy = link_no_ip_fuzzy.asInstanceOf[js.Any], pretest = pretest.asInstanceOf[js.Any], schema_search = schema_search.asInstanceOf[js.Any], schema_test = schema_test.asInstanceOf[js.Any], src_Any = src_Any.asInstanceOf[js.Any], src_Cc = src_Cc.asInstanceOf[js.Any], src_P = src_P.asInstanceOf[js.Any], src_Z = src_Z.asInstanceOf[js.Any], src_ZCc = src_ZCc.asInstanceOf[js.Any], src_ZPCc = src_ZPCc.asInstanceOf[js.Any], src_auth = src_auth.asInstanceOf[js.Any], src_domain = src_domain.asInstanceOf[js.Any], src_domain_root = src_domain_root.asInstanceOf[js.Any], src_email_name = src_email_name.asInstanceOf[js.Any], src_host = src_host.asInstanceOf[js.Any], src_host_port_strict = src_host_port_strict.asInstanceOf[js.Any], src_host_strict = src_host_strict.asInstanceOf[js.Any], src_host_terminator = src_host_terminator.asInstanceOf[js.Any], src_ip4 = src_ip4.asInstanceOf[js.Any], src_path = src_path.asInstanceOf[js.Any], src_port = src_port.asInstanceOf[js.Any], src_tlds = src_tlds.asInstanceOf[js.Any], src_xn = src_xn.asInstanceOf[js.Any], tpl_email_fuzzy = tpl_email_fuzzy.asInstanceOf[js.Any], tpl_host_fuzzy = tpl_host_fuzzy.asInstanceOf[js.Any], tpl_host_fuzzy_strict = tpl_host_fuzzy_strict.asInstanceOf[js.Any], tpl_host_fuzzy_test = tpl_host_fuzzy_test.asInstanceOf[js.Any], tpl_host_no_ip_fuzzy = tpl_host_no_ip_fuzzy.asInstanceOf[js.Any], tpl_host_port_fuzzy_strict = tpl_host_port_fuzzy_strict.asInstanceOf[js.Any], tpl_host_port_no_ip_fuzzy_strict = tpl_host_port_no_ip_fuzzy_strict.asInstanceOf[js.Any], tpl_link_fuzzy = tpl_link_fuzzy.asInstanceOf[js.Any], tpl_link_no_ip_fuzzy = tpl_link_no_ip_fuzzy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Emailfuzzy]
  }
  
  @scala.inline
  implicit class EmailfuzzyOps[Self <: Emailfuzzy] (val x: Self) extends AnyVal {
    
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
    def setEmail_fuzzy(value: RegExp): Self = this.set("email_fuzzy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost_fuzzy_test(value: RegExp): Self = this.set("host_fuzzy_test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink_fuzzy(value: RegExp): Self = this.set("link_fuzzy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink_no_ip_fuzzy(value: RegExp): Self = this.set("link_no_ip_fuzzy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPretest(value: RegExp): Self = this.set("pretest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema_search(value: RegExp): Self = this.set("schema_search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema_test(value: RegExp): Self = this.set("schema_test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc_Any(value: String): Self = this.set("src_Any", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc_Cc(value: String): Self = this.set("src_Cc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc_P(value: String): Self = this.set("src_P", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc_Z(value: String): Self = this.set("src_Z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc_ZCc(value: String): Self = this.set("src_ZCc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc_ZPCc(value: String): Self = this.set("src_ZPCc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc_auth(value: String): Self = this.set("src_auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc_domain(value: String): Self = this.set("src_domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc_domain_root(value: String): Self = this.set("src_domain_root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc_email_name(value: String): Self = this.set("src_email_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc_host(value: String): Self = this.set("src_host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc_host_port_strict(value: String): Self = this.set("src_host_port_strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc_host_strict(value: String): Self = this.set("src_host_strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc_host_terminator(value: String): Self = this.set("src_host_terminator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc_ip4(value: String): Self = this.set("src_ip4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc_path(value: String): Self = this.set("src_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc_port(value: String): Self = this.set("src_port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc_tlds(value: String): Self = this.set("src_tlds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc_xn(value: String): Self = this.set("src_xn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTpl_email_fuzzy(value: String): Self = this.set("tpl_email_fuzzy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTpl_host_fuzzy(value: String): Self = this.set("tpl_host_fuzzy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTpl_host_fuzzy_strict(value: String): Self = this.set("tpl_host_fuzzy_strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTpl_host_fuzzy_test(value: String): Self = this.set("tpl_host_fuzzy_test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTpl_host_no_ip_fuzzy(value: String): Self = this.set("tpl_host_no_ip_fuzzy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTpl_host_port_fuzzy_strict(value: String): Self = this.set("tpl_host_port_fuzzy_strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTpl_host_port_no_ip_fuzzy_strict(value: String): Self = this.set("tpl_host_port_no_ip_fuzzy_strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTpl_link_fuzzy(value: String): Self = this.set("tpl_link_fuzzy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTpl_link_no_ip_fuzzy(value: String): Self = this.set("tpl_link_no_ip_fuzzy", value.asInstanceOf[js.Any])
  }
}
