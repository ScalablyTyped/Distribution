organization := "org.scalablytyped"
name := "tgfancy"
version := "0.13-dt-20180822Z-e0fd03"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20200515Z-911575",
  "org.scalablytyped" %%% "form-data" % "3.0.0-8c69ed",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "node-telegram-bot-api" % "0.50-dt-20201014Z-d86d8d",
  "org.scalablytyped" %%% "request" % "2.48-dt-20200515Z-989d2d",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20201002Z-f8d115")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
