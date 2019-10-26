package typings.vcf

import typings.vcf.vcfMod.CardVersion
import typings.vcf.vcfMod.ParameterType
import typings.vcf.vcfMod.PropertyType
import typings.vcf.vcfMod.ValueDataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object vcfStrings {
  @js.native
  sealed trait `2DOT1` extends CardVersion
  
  @js.native
  sealed trait `3DOT0` extends CardVersion
  
  @js.native
  sealed trait `4DOT0` extends CardVersion
  
  @js.native
  sealed trait adr extends PropertyType
  
  @js.native
  sealed trait altid extends ParameterType
  
  @js.native
  sealed trait anniversary extends PropertyType
  
  @js.native
  sealed trait bday extends PropertyType
  
  @js.native
  sealed trait begin extends PropertyType
  
  @js.native
  sealed trait boolean extends ValueDataType
  
  @js.native
  sealed trait caladruri extends PropertyType
  
  @js.native
  sealed trait calscale extends ParameterType
  
  @js.native
  sealed trait caluri extends PropertyType
  
  @js.native
  sealed trait categories extends PropertyType
  
  @js.native
  sealed trait clientpidmap extends PropertyType
  
  @js.native
  sealed trait date extends ValueDataType
  
  @js.native
  sealed trait `date-and-or-time` extends ValueDataType
  
  @js.native
  sealed trait `date-time` extends ValueDataType
  
  @js.native
  sealed trait email extends PropertyType
  
  @js.native
  sealed trait end extends PropertyType
  
  @js.native
  sealed trait fburl extends PropertyType
  
  @js.native
  sealed trait float extends ValueDataType
  
  @js.native
  sealed trait fn extends PropertyType
  
  @js.native
  sealed trait gender extends PropertyType
  
  @js.native
  sealed trait geo
    extends ParameterType
       with PropertyType
  
  @js.native
  sealed trait group extends ParameterType
  
  @js.native
  sealed trait impp extends PropertyType
  
  @js.native
  sealed trait integer extends ValueDataType
  
  @js.native
  sealed trait key extends PropertyType
  
  @js.native
  sealed trait kind extends PropertyType
  
  @js.native
  sealed trait lang extends PropertyType
  
  @js.native
  sealed trait language extends ParameterType
  
  @js.native
  sealed trait `language-tag` extends ValueDataType
  
  @js.native
  sealed trait logo extends PropertyType
  
  @js.native
  sealed trait mediatype extends ParameterType
  
  @js.native
  sealed trait member extends PropertyType
  
  @js.native
  sealed trait n extends PropertyType
  
  @js.native
  sealed trait nickname extends PropertyType
  
  @js.native
  sealed trait note extends PropertyType
  
  @js.native
  sealed trait org extends PropertyType
  
  @js.native
  sealed trait photo extends PropertyType
  
  @js.native
  sealed trait pid extends ParameterType
  
  @js.native
  sealed trait pref extends ParameterType
  
  @js.native
  sealed trait prodid extends PropertyType
  
  @js.native
  sealed trait related extends PropertyType
  
  @js.native
  sealed trait rev extends PropertyType
  
  @js.native
  sealed trait role extends PropertyType
  
  @js.native
  sealed trait `sort-as` extends ParameterType
  
  @js.native
  sealed trait sound extends PropertyType
  
  @js.native
  sealed trait source extends PropertyType
  
  @js.native
  sealed trait tel extends PropertyType
  
  @js.native
  sealed trait text extends ValueDataType
  
  @js.native
  sealed trait time extends ValueDataType
  
  @js.native
  sealed trait timestamp extends ValueDataType
  
  @js.native
  sealed trait title extends PropertyType
  
  @js.native
  sealed trait `type` extends ParameterType
  
  @js.native
  sealed trait tz
    extends ParameterType
       with PropertyType
  
  @js.native
  sealed trait uid extends PropertyType
  
  @js.native
  sealed trait uri extends ValueDataType
  
  @js.native
  sealed trait url extends PropertyType
  
  @js.native
  sealed trait `utc-offset` extends ValueDataType
  
  @js.native
  sealed trait value extends ParameterType
  
  @js.native
  sealed trait vcard extends js.Object
  
  @js.native
  sealed trait version extends PropertyType
  
  @js.native
  sealed trait xml extends PropertyType
  
  @scala.inline
  def `2DOT1`: `2DOT1` = "2.1".asInstanceOf[`2DOT1`]
  @scala.inline
  def `3DOT0`: `3DOT0` = "3.0".asInstanceOf[`3DOT0`]
  @scala.inline
  def `4DOT0`: `4DOT0` = "4.0".asInstanceOf[`4DOT0`]
  @scala.inline
  def adr: adr = "adr".asInstanceOf[adr]
  @scala.inline
  def altid: altid = "altid".asInstanceOf[altid]
  @scala.inline
  def anniversary: anniversary = "anniversary".asInstanceOf[anniversary]
  @scala.inline
  def bday: bday = "bday".asInstanceOf[bday]
  @scala.inline
  def begin: begin = "begin".asInstanceOf[begin]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def caladruri: caladruri = "caladruri".asInstanceOf[caladruri]
  @scala.inline
  def calscale: calscale = "calscale".asInstanceOf[calscale]
  @scala.inline
  def caluri: caluri = "caluri".asInstanceOf[caluri]
  @scala.inline
  def categories: categories = "categories".asInstanceOf[categories]
  @scala.inline
  def clientpidmap: clientpidmap = "clientpidmap".asInstanceOf[clientpidmap]
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  @scala.inline
  def `date-and-or-time`: `date-and-or-time` = "date-and-or-time".asInstanceOf[`date-and-or-time`]
  @scala.inline
  def `date-time`: `date-time` = "date-time".asInstanceOf[`date-time`]
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def fburl: fburl = "fburl".asInstanceOf[fburl]
  @scala.inline
  def float: float = "float".asInstanceOf[float]
  @scala.inline
  def fn: fn = "fn".asInstanceOf[fn]
  @scala.inline
  def gender: gender = "gender".asInstanceOf[gender]
  @scala.inline
  def geo: geo = "geo".asInstanceOf[geo]
  @scala.inline
  def group: group = "group".asInstanceOf[group]
  @scala.inline
  def impp: impp = "impp".asInstanceOf[impp]
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  @scala.inline
  def key: key = "key".asInstanceOf[key]
  @scala.inline
  def kind: kind = "kind".asInstanceOf[kind]
  @scala.inline
  def lang: lang = "lang".asInstanceOf[lang]
  @scala.inline
  def language: language = "language".asInstanceOf[language]
  @scala.inline
  def `language-tag`: `language-tag` = "language-tag".asInstanceOf[`language-tag`]
  @scala.inline
  def logo: logo = "logo".asInstanceOf[logo]
  @scala.inline
  def mediatype: mediatype = "mediatype".asInstanceOf[mediatype]
  @scala.inline
  def member: member = "member".asInstanceOf[member]
  @scala.inline
  def n: n = "n".asInstanceOf[n]
  @scala.inline
  def nickname: nickname = "nickname".asInstanceOf[nickname]
  @scala.inline
  def note: note = "note".asInstanceOf[note]
  @scala.inline
  def org: org = "org".asInstanceOf[org]
  @scala.inline
  def photo: photo = "photo".asInstanceOf[photo]
  @scala.inline
  def pid: pid = "pid".asInstanceOf[pid]
  @scala.inline
  def pref: pref = "pref".asInstanceOf[pref]
  @scala.inline
  def prodid: prodid = "prodid".asInstanceOf[prodid]
  @scala.inline
  def related: related = "related".asInstanceOf[related]
  @scala.inline
  def rev: rev = "rev".asInstanceOf[rev]
  @scala.inline
  def role: role = "role".asInstanceOf[role]
  @scala.inline
  def `sort-as`: `sort-as` = "sort-as".asInstanceOf[`sort-as`]
  @scala.inline
  def sound: sound = "sound".asInstanceOf[sound]
  @scala.inline
  def source: source = "source".asInstanceOf[source]
  @scala.inline
  def tel: tel = "tel".asInstanceOf[tel]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def time: time = "time".asInstanceOf[time]
  @scala.inline
  def timestamp: timestamp = "timestamp".asInstanceOf[timestamp]
  @scala.inline
  def title: title = "title".asInstanceOf[title]
  @scala.inline
  def `type`: `type` = "type".asInstanceOf[`type`]
  @scala.inline
  def tz: tz = "tz".asInstanceOf[tz]
  @scala.inline
  def uid: uid = "uid".asInstanceOf[uid]
  @scala.inline
  def uri: uri = "uri".asInstanceOf[uri]
  @scala.inline
  def url: url = "url".asInstanceOf[url]
  @scala.inline
  def `utc-offset`: `utc-offset` = "utc-offset".asInstanceOf[`utc-offset`]
  @scala.inline
  def value: value = "value".asInstanceOf[value]
  @scala.inline
  def vcard: vcard = "vcard".asInstanceOf[vcard]
  @scala.inline
  def version: version = "version".asInstanceOf[version]
  @scala.inline
  def xml: xml = "xml".asInstanceOf[xml]
}

