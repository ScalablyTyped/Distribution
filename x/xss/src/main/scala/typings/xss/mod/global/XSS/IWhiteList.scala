package typings.xss.mod.global.XSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWhiteList extends js.Object {
  
  var a: js.UndefOr[js.Array[String]] = js.native
  
  var abbr: js.UndefOr[js.Array[String]] = js.native
  
  var address: js.UndefOr[js.Array[String]] = js.native
  
  var area: js.UndefOr[js.Array[String]] = js.native
  
  var article: js.UndefOr[js.Array[String]] = js.native
  
  var aside: js.UndefOr[js.Array[String]] = js.native
  
  var audio: js.UndefOr[js.Array[String]] = js.native
  
  var b: js.UndefOr[js.Array[String]] = js.native
  
  var bdi: js.UndefOr[js.Array[String]] = js.native
  
  var bdo: js.UndefOr[js.Array[String]] = js.native
  
  var big: js.UndefOr[js.Array[String]] = js.native
  
  var blockquote: js.UndefOr[js.Array[String]] = js.native
  
  var br: js.UndefOr[js.Array[String]] = js.native
  
  var caption: js.UndefOr[js.Array[String]] = js.native
  
  var center: js.UndefOr[js.Array[String]] = js.native
  
  var cite: js.UndefOr[js.Array[String]] = js.native
  
  var code: js.UndefOr[js.Array[String]] = js.native
  
  var col: js.UndefOr[js.Array[String]] = js.native
  
  var colgroup: js.UndefOr[js.Array[String]] = js.native
  
  var dd: js.UndefOr[js.Array[String]] = js.native
  
  var del: js.UndefOr[js.Array[String]] = js.native
  
  var details: js.UndefOr[js.Array[String]] = js.native
  
  var div: js.UndefOr[js.Array[String]] = js.native
  
  var dl: js.UndefOr[js.Array[String]] = js.native
  
  var dt: js.UndefOr[js.Array[String]] = js.native
  
  var em: js.UndefOr[js.Array[String]] = js.native
  
  var font: js.UndefOr[js.Array[String]] = js.native
  
  var footer: js.UndefOr[js.Array[String]] = js.native
  
  var h1: js.UndefOr[js.Array[String]] = js.native
  
  var h2: js.UndefOr[js.Array[String]] = js.native
  
  var h3: js.UndefOr[js.Array[String]] = js.native
  
  var h4: js.UndefOr[js.Array[String]] = js.native
  
  var h5: js.UndefOr[js.Array[String]] = js.native
  
  var h6: js.UndefOr[js.Array[String]] = js.native
  
  var header: js.UndefOr[js.Array[String]] = js.native
  
  var hr: js.UndefOr[js.Array[String]] = js.native
  
  var i: js.UndefOr[js.Array[String]] = js.native
  
  var img: js.UndefOr[js.Array[String]] = js.native
  
  var ins: js.UndefOr[js.Array[String]] = js.native
  
  var li: js.UndefOr[js.Array[String]] = js.native
  
  var mark: js.UndefOr[js.Array[String]] = js.native
  
  var nav: js.UndefOr[js.Array[String]] = js.native
  
  var ol: js.UndefOr[js.Array[String]] = js.native
  
  var p: js.UndefOr[js.Array[String]] = js.native
  
  var pre: js.UndefOr[js.Array[String]] = js.native
  
  var s: js.UndefOr[js.Array[String]] = js.native
  
  var section: js.UndefOr[js.Array[String]] = js.native
  
  var small: js.UndefOr[js.Array[String]] = js.native
  
  var span: js.UndefOr[js.Array[String]] = js.native
  
  var strong: js.UndefOr[js.Array[String]] = js.native
  
  var sub: js.UndefOr[js.Array[String]] = js.native
  
  var sup: js.UndefOr[js.Array[String]] = js.native
  
  var table: js.UndefOr[js.Array[String]] = js.native
  
  var tbody: js.UndefOr[js.Array[String]] = js.native
  
  var td: js.UndefOr[js.Array[String]] = js.native
  
  var tfoot: js.UndefOr[js.Array[String]] = js.native
  
  var th: js.UndefOr[js.Array[String]] = js.native
  
  var thead: js.UndefOr[js.Array[String]] = js.native
  
  var tr: js.UndefOr[js.Array[String]] = js.native
  
  var tt: js.UndefOr[js.Array[String]] = js.native
  
  var u: js.UndefOr[js.Array[String]] = js.native
  
  var ul: js.UndefOr[js.Array[String]] = js.native
  
  var video: js.UndefOr[js.Array[String]] = js.native
}
object IWhiteList {
  
  @scala.inline
  def apply(): IWhiteList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWhiteList]
  }
  
  @scala.inline
  implicit class IWhiteListOps[Self <: IWhiteList] (val x: Self) extends AnyVal {
    
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
    def setAVarargs(value: String*): Self = this.set("a", js.Array(value :_*))
    
    @scala.inline
    def setA(value: js.Array[String]): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteA: Self = this.set("a", js.undefined)
    
    @scala.inline
    def setAbbrVarargs(value: String*): Self = this.set("abbr", js.Array(value :_*))
    
    @scala.inline
    def setAbbr(value: js.Array[String]): Self = this.set("abbr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbbr: Self = this.set("abbr", js.undefined)
    
    @scala.inline
    def setAddressVarargs(value: String*): Self = this.set("address", js.Array(value :_*))
    
    @scala.inline
    def setAddress(value: js.Array[String]): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setAreaVarargs(value: String*): Self = this.set("area", js.Array(value :_*))
    
    @scala.inline
    def setArea(value: js.Array[String]): Self = this.set("area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    
    @scala.inline
    def setArticleVarargs(value: String*): Self = this.set("article", js.Array(value :_*))
    
    @scala.inline
    def setArticle(value: js.Array[String]): Self = this.set("article", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArticle: Self = this.set("article", js.undefined)
    
    @scala.inline
    def setAsideVarargs(value: String*): Self = this.set("aside", js.Array(value :_*))
    
    @scala.inline
    def setAside(value: js.Array[String]): Self = this.set("aside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAside: Self = this.set("aside", js.undefined)
    
    @scala.inline
    def setAudioVarargs(value: String*): Self = this.set("audio", js.Array(value :_*))
    
    @scala.inline
    def setAudio(value: js.Array[String]): Self = this.set("audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    
    @scala.inline
    def setBVarargs(value: String*): Self = this.set("b", js.Array(value :_*))
    
    @scala.inline
    def setB(value: js.Array[String]): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteB: Self = this.set("b", js.undefined)
    
    @scala.inline
    def setBdiVarargs(value: String*): Self = this.set("bdi", js.Array(value :_*))
    
    @scala.inline
    def setBdi(value: js.Array[String]): Self = this.set("bdi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBdi: Self = this.set("bdi", js.undefined)
    
    @scala.inline
    def setBdoVarargs(value: String*): Self = this.set("bdo", js.Array(value :_*))
    
    @scala.inline
    def setBdo(value: js.Array[String]): Self = this.set("bdo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBdo: Self = this.set("bdo", js.undefined)
    
    @scala.inline
    def setBigVarargs(value: String*): Self = this.set("big", js.Array(value :_*))
    
    @scala.inline
    def setBig(value: js.Array[String]): Self = this.set("big", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBig: Self = this.set("big", js.undefined)
    
    @scala.inline
    def setBlockquoteVarargs(value: String*): Self = this.set("blockquote", js.Array(value :_*))
    
    @scala.inline
    def setBlockquote(value: js.Array[String]): Self = this.set("blockquote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockquote: Self = this.set("blockquote", js.undefined)
    
    @scala.inline
    def setBrVarargs(value: String*): Self = this.set("br", js.Array(value :_*))
    
    @scala.inline
    def setBr(value: js.Array[String]): Self = this.set("br", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBr: Self = this.set("br", js.undefined)
    
    @scala.inline
    def setCaptionVarargs(value: String*): Self = this.set("caption", js.Array(value :_*))
    
    @scala.inline
    def setCaption(value: js.Array[String]): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setCenterVarargs(value: String*): Self = this.set("center", js.Array(value :_*))
    
    @scala.inline
    def setCenter(value: js.Array[String]): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setCiteVarargs(value: String*): Self = this.set("cite", js.Array(value :_*))
    
    @scala.inline
    def setCite(value: js.Array[String]): Self = this.set("cite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCite: Self = this.set("cite", js.undefined)
    
    @scala.inline
    def setCodeVarargs(value: String*): Self = this.set("code", js.Array(value :_*))
    
    @scala.inline
    def setCode(value: js.Array[String]): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setColVarargs(value: String*): Self = this.set("col", js.Array(value :_*))
    
    @scala.inline
    def setCol(value: js.Array[String]): Self = this.set("col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCol: Self = this.set("col", js.undefined)
    
    @scala.inline
    def setColgroupVarargs(value: String*): Self = this.set("colgroup", js.Array(value :_*))
    
    @scala.inline
    def setColgroup(value: js.Array[String]): Self = this.set("colgroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColgroup: Self = this.set("colgroup", js.undefined)
    
    @scala.inline
    def setDdVarargs(value: String*): Self = this.set("dd", js.Array(value :_*))
    
    @scala.inline
    def setDd(value: js.Array[String]): Self = this.set("dd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDd: Self = this.set("dd", js.undefined)
    
    @scala.inline
    def setDelVarargs(value: String*): Self = this.set("del", js.Array(value :_*))
    
    @scala.inline
    def setDel(value: js.Array[String]): Self = this.set("del", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDel: Self = this.set("del", js.undefined)
    
    @scala.inline
    def setDetailsVarargs(value: String*): Self = this.set("details", js.Array(value :_*))
    
    @scala.inline
    def setDetails(value: js.Array[String]): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setDivVarargs(value: String*): Self = this.set("div", js.Array(value :_*))
    
    @scala.inline
    def setDiv(value: js.Array[String]): Self = this.set("div", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiv: Self = this.set("div", js.undefined)
    
    @scala.inline
    def setDlVarargs(value: String*): Self = this.set("dl", js.Array(value :_*))
    
    @scala.inline
    def setDl(value: js.Array[String]): Self = this.set("dl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDl: Self = this.set("dl", js.undefined)
    
    @scala.inline
    def setDtVarargs(value: String*): Self = this.set("dt", js.Array(value :_*))
    
    @scala.inline
    def setDt(value: js.Array[String]): Self = this.set("dt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDt: Self = this.set("dt", js.undefined)
    
    @scala.inline
    def setEmVarargs(value: String*): Self = this.set("em", js.Array(value :_*))
    
    @scala.inline
    def setEm(value: js.Array[String]): Self = this.set("em", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEm: Self = this.set("em", js.undefined)
    
    @scala.inline
    def setFontVarargs(value: String*): Self = this.set("font", js.Array(value :_*))
    
    @scala.inline
    def setFont(value: js.Array[String]): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFooterVarargs(value: String*): Self = this.set("footer", js.Array(value :_*))
    
    @scala.inline
    def setFooter(value: js.Array[String]): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setH1Varargs(value: String*): Self = this.set("h1", js.Array(value :_*))
    
    @scala.inline
    def setH1(value: js.Array[String]): Self = this.set("h1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH1: Self = this.set("h1", js.undefined)
    
    @scala.inline
    def setH2Varargs(value: String*): Self = this.set("h2", js.Array(value :_*))
    
    @scala.inline
    def setH2(value: js.Array[String]): Self = this.set("h2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH2: Self = this.set("h2", js.undefined)
    
    @scala.inline
    def setH3Varargs(value: String*): Self = this.set("h3", js.Array(value :_*))
    
    @scala.inline
    def setH3(value: js.Array[String]): Self = this.set("h3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH3: Self = this.set("h3", js.undefined)
    
    @scala.inline
    def setH4Varargs(value: String*): Self = this.set("h4", js.Array(value :_*))
    
    @scala.inline
    def setH4(value: js.Array[String]): Self = this.set("h4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH4: Self = this.set("h4", js.undefined)
    
    @scala.inline
    def setH5Varargs(value: String*): Self = this.set("h5", js.Array(value :_*))
    
    @scala.inline
    def setH5(value: js.Array[String]): Self = this.set("h5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH5: Self = this.set("h5", js.undefined)
    
    @scala.inline
    def setH6Varargs(value: String*): Self = this.set("h6", js.Array(value :_*))
    
    @scala.inline
    def setH6(value: js.Array[String]): Self = this.set("h6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH6: Self = this.set("h6", js.undefined)
    
    @scala.inline
    def setHeaderVarargs(value: String*): Self = this.set("header", js.Array(value :_*))
    
    @scala.inline
    def setHeader(value: js.Array[String]): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHrVarargs(value: String*): Self = this.set("hr", js.Array(value :_*))
    
    @scala.inline
    def setHr(value: js.Array[String]): Self = this.set("hr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHr: Self = this.set("hr", js.undefined)
    
    @scala.inline
    def setIVarargs(value: String*): Self = this.set("i", js.Array(value :_*))
    
    @scala.inline
    def setI(value: js.Array[String]): Self = this.set("i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI: Self = this.set("i", js.undefined)
    
    @scala.inline
    def setImgVarargs(value: String*): Self = this.set("img", js.Array(value :_*))
    
    @scala.inline
    def setImg(value: js.Array[String]): Self = this.set("img", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImg: Self = this.set("img", js.undefined)
    
    @scala.inline
    def setInsVarargs(value: String*): Self = this.set("ins", js.Array(value :_*))
    
    @scala.inline
    def setIns(value: js.Array[String]): Self = this.set("ins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIns: Self = this.set("ins", js.undefined)
    
    @scala.inline
    def setLiVarargs(value: String*): Self = this.set("li", js.Array(value :_*))
    
    @scala.inline
    def setLi(value: js.Array[String]): Self = this.set("li", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLi: Self = this.set("li", js.undefined)
    
    @scala.inline
    def setMarkVarargs(value: String*): Self = this.set("mark", js.Array(value :_*))
    
    @scala.inline
    def setMark(value: js.Array[String]): Self = this.set("mark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMark: Self = this.set("mark", js.undefined)
    
    @scala.inline
    def setNavVarargs(value: String*): Self = this.set("nav", js.Array(value :_*))
    
    @scala.inline
    def setNav(value: js.Array[String]): Self = this.set("nav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNav: Self = this.set("nav", js.undefined)
    
    @scala.inline
    def setOlVarargs(value: String*): Self = this.set("ol", js.Array(value :_*))
    
    @scala.inline
    def setOl(value: js.Array[String]): Self = this.set("ol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOl: Self = this.set("ol", js.undefined)
    
    @scala.inline
    def setPVarargs(value: String*): Self = this.set("p", js.Array(value :_*))
    
    @scala.inline
    def setP(value: js.Array[String]): Self = this.set("p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP: Self = this.set("p", js.undefined)
    
    @scala.inline
    def setPreVarargs(value: String*): Self = this.set("pre", js.Array(value :_*))
    
    @scala.inline
    def setPre(value: js.Array[String]): Self = this.set("pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePre: Self = this.set("pre", js.undefined)
    
    @scala.inline
    def setSVarargs(value: String*): Self = this.set("s", js.Array(value :_*))
    
    @scala.inline
    def setS(value: js.Array[String]): Self = this.set("s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS: Self = this.set("s", js.undefined)
    
    @scala.inline
    def setSectionVarargs(value: String*): Self = this.set("section", js.Array(value :_*))
    
    @scala.inline
    def setSection(value: js.Array[String]): Self = this.set("section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSection: Self = this.set("section", js.undefined)
    
    @scala.inline
    def setSmallVarargs(value: String*): Self = this.set("small", js.Array(value :_*))
    
    @scala.inline
    def setSmall(value: js.Array[String]): Self = this.set("small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
    
    @scala.inline
    def setSpanVarargs(value: String*): Self = this.set("span", js.Array(value :_*))
    
    @scala.inline
    def setSpan(value: js.Array[String]): Self = this.set("span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpan: Self = this.set("span", js.undefined)
    
    @scala.inline
    def setStrongVarargs(value: String*): Self = this.set("strong", js.Array(value :_*))
    
    @scala.inline
    def setStrong(value: js.Array[String]): Self = this.set("strong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrong: Self = this.set("strong", js.undefined)
    
    @scala.inline
    def setSubVarargs(value: String*): Self = this.set("sub", js.Array(value :_*))
    
    @scala.inline
    def setSub(value: js.Array[String]): Self = this.set("sub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSub: Self = this.set("sub", js.undefined)
    
    @scala.inline
    def setSupVarargs(value: String*): Self = this.set("sup", js.Array(value :_*))
    
    @scala.inline
    def setSup(value: js.Array[String]): Self = this.set("sup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSup: Self = this.set("sup", js.undefined)
    
    @scala.inline
    def setTableVarargs(value: String*): Self = this.set("table", js.Array(value :_*))
    
    @scala.inline
    def setTable(value: js.Array[String]): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    
    @scala.inline
    def setTbodyVarargs(value: String*): Self = this.set("tbody", js.Array(value :_*))
    
    @scala.inline
    def setTbody(value: js.Array[String]): Self = this.set("tbody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTbody: Self = this.set("tbody", js.undefined)
    
    @scala.inline
    def setTdVarargs(value: String*): Self = this.set("td", js.Array(value :_*))
    
    @scala.inline
    def setTd(value: js.Array[String]): Self = this.set("td", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTd: Self = this.set("td", js.undefined)
    
    @scala.inline
    def setTfootVarargs(value: String*): Self = this.set("tfoot", js.Array(value :_*))
    
    @scala.inline
    def setTfoot(value: js.Array[String]): Self = this.set("tfoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTfoot: Self = this.set("tfoot", js.undefined)
    
    @scala.inline
    def setThVarargs(value: String*): Self = this.set("th", js.Array(value :_*))
    
    @scala.inline
    def setTh(value: js.Array[String]): Self = this.set("th", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTh: Self = this.set("th", js.undefined)
    
    @scala.inline
    def setTheadVarargs(value: String*): Self = this.set("thead", js.Array(value :_*))
    
    @scala.inline
    def setThead(value: js.Array[String]): Self = this.set("thead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThead: Self = this.set("thead", js.undefined)
    
    @scala.inline
    def setTrVarargs(value: String*): Self = this.set("tr", js.Array(value :_*))
    
    @scala.inline
    def setTr(value: js.Array[String]): Self = this.set("tr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTr: Self = this.set("tr", js.undefined)
    
    @scala.inline
    def setTtVarargs(value: String*): Self = this.set("tt", js.Array(value :_*))
    
    @scala.inline
    def setTt(value: js.Array[String]): Self = this.set("tt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTt: Self = this.set("tt", js.undefined)
    
    @scala.inline
    def setUVarargs(value: String*): Self = this.set("u", js.Array(value :_*))
    
    @scala.inline
    def setU(value: js.Array[String]): Self = this.set("u", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteU: Self = this.set("u", js.undefined)
    
    @scala.inline
    def setUlVarargs(value: String*): Self = this.set("ul", js.Array(value :_*))
    
    @scala.inline
    def setUl(value: js.Array[String]): Self = this.set("ul", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUl: Self = this.set("ul", js.undefined)
    
    @scala.inline
    def setVideoVarargs(value: String*): Self = this.set("video", js.Array(value :_*))
    
    @scala.inline
    def setVideo(value: js.Array[String]): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
  }
}
